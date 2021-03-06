import { getProcessEnv } from "../lib/utils";

export const config = {
    grpcPort: parseInt(getProcessEnv("GRPC_PORT", "3000"), 10),
    redisPort: parseInt(getProcessEnv("REDIS_PORT", "6379"), 10),
    redisHost: getProcessEnv("REDIS_HOST", "redis"),
    healthCheckPort: parseInt(getProcessEnv("HEALTH_CHECK_PORT", "4000"), 10),
    healthCheckPath: getProcessEnv("HEALTH_CHECK_PATH", "/health"),
};
