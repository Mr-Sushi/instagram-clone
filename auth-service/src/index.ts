import grpc from "grpc";
import pino from "pino";
import redis from "redis";

import { kafkaClientOptions } from "./config/kafka";
import sequelize from "./config/sequelize";
import { config } from "./config/server";
import authHandler from "./handlers/AuthService";
import { KafkaProducer } from "./lib/kafka/KafkaProducer";
import { ServiceDiscovery } from "./lib/ServiceDiscovery";
import { delay } from "./lib/utils";
import { protoIndex } from "./proto";

protoIndex();

const INITIAL_RE_REGISTER_INTERVAL = 5000;
const MAX_RE_REGITER_COUNT = 5;
const port = config.grpcPort;

const logger = pino();
const server = new grpc.Server();
const serviceDiscovery = ServiceDiscovery.getInstance();

const redisClient = redis.createClient(config.redisPort, config.redisHost);
const producer = new KafkaProducer(kafkaClientOptions);

producer.prepareClient()
    .then(() => logger.info("Kafka producer ready"))
    .catch(logger.error);

redisClient.on("connect", () => {
    logger.info("Redis client connected");
});
redisClient.on("error", (err) => {
    logger.error("Redis client got error " + err);
});

server.addService(
    authHandler.AuthService,
    new authHandler.AuthHandler(redisClient, producer),
);

server.bindAsync(
    `0.0.0.0:${port}`,
    grpc.ServerCredentials.createInsecure(),
    (err, portNum) => {
        if (err !== null) {
            sequelize.close();
            return logger.error(err);
        }
        logger.info(`auth-service gRPC listening on ${portNum}`);
        serviceDiscovery.registerService(handleHeartbeatFailure)
            .then(() => {
                const id = serviceDiscovery.instanceId;
                const name = serviceDiscovery.serviceName;
                logger.info(
                    `Instance registered to consul with name ${name} and id ${id}`,
                );
            })
            .catch((e) => {
                logger.error(e);
            });
    },
);

/**
 * Shutdown the GRPC server.
 */
function shutdownServer() {
    return new Promise((resolve) => {
        server.tryShutdown(() => {
            redisClient.quit(() => resolve());
        });
    });
}

/**
 * Shutdown handler when a signal is received.
 *
 * @param signal The received signal, e.g. `SIGINT`
 */
function onSignal(signal: string) {
    logger.info(`Received ${signal}, cleaning up and shutting down...`);
    const promises = [
        shutdownServer(),
    ];
    if (serviceDiscovery.isRegistered()) {
        promises.push(serviceDiscovery.deregister());
    }
    return Promise.all(promises)
        .catch(logger.error)
        .finally(() => process.exit(0));
}

/**
 * Handle failure heartbeat with consul.
 *
 * @param err The error
 */
function handleHeartbeatFailure(err: Error) {
    logger.error(err, "Heartbeat to consul failed");
    reRegisterServiceDiscovery()
        .catch((e: any) => logger.error(e));
}

/**
 * Re-register this particular instance to consul.
 *
 * @param count Count of re-registration trials
 */
async function reRegisterServiceDiscovery(count = 1): Promise<void> {
    if (count > MAX_RE_REGITER_COUNT) {
        logger.info(
            "Consul re-registration trial count exceeded max "
                + `value of ${MAX_RE_REGITER_COUNT}`,
        );
        return;
    }
    // Deregister if we are already registered
    if (serviceDiscovery.isRegistered()) {
        try {
            await serviceDiscovery.deregister();
        } catch (e) {
            const ms = count * INITIAL_RE_REGISTER_INTERVAL;
            logger.error(
                `Deregistration failed, trying again in ${ms / 1000} seconds...`,
                e,
            );
            await delay(ms);
            return reRegisterServiceDiscovery(count++);
        }
    }
    // Register to the consul
    try {
        await serviceDiscovery.registerService(handleHeartbeatFailure);
    } catch (e) {
        const ms = count * INITIAL_RE_REGISTER_INTERVAL;
        logger.error(
            `Re-registration failed, trying again in ${ms / 1000} seconds...`,
            e,
        );
        await delay(ms);
        return reRegisterServiceDiscovery(count++);
    }
    logger.info("Re-registration successful");
}

process.on("SIGTERM", onSignal);
process.on("SIGINT", onSignal);
process.on("SIGUSR1", onSignal);
process.on("SIGUSR2", onSignal);
process.on("SIGHUP", onSignal);
process.on("SIGBREAK", onSignal);

server.start();
