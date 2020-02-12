import { RedisClient } from "redis";

/**
 * Get a variable from `process.env` and throw if not found.
 *
 * @param value The env variable e.g `SERVER_PORT`
 * @param fallback Optional fallback value in case the value is empty (or not defined)
 */
export function getProcessEnv(
    value: string,
    fallback: string | null = null,
): string {
    if (typeof value !== "string") {
        throw new TypeError(
            `Expected value to be string but received: ${value}`,
        );
    }
    const val = process.env[value];
    if (!val && !fallback) {
        throw new Error(`Unable to find env variable ${value}`);
    }
    return val || fallback as string;
}

/**
 * Delay execution asynchronously.
 *
 * @param ms Time in milliseconds
 */
export function delay(ms: number) {
    return new Promise((resolve) => {
        setTimeout(() => resolve(), ms);
    });
}

/**
 * Return item from redis wrapped in promise
 * 
 * @param key key of the item
 * @param redis RedisClient
 */
export function getFromRedis(key: string, redis: RedisClient): Promise<any> {
    return new Promise((resolve, reject) => {
        redis.get(key, (err, value) => {
            if (err) {
                reject(err);
            } else {
                value ? resolve(value) : reject(null);
            }
        });
    });
}