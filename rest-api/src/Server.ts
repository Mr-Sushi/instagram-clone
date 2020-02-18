import Koa, { ParameterizedContext } from "koa";
import bodyParser from "koa-bodyparser";
import middlewareLogger from "koa-pino-logger";
import Router, { RouterContext } from "@koa/router";
import pino from "pino";

import { AuthController } from "./controllers/AuthController";
import { RequestError } from "./lib/RequestError";
import { AuthService } from "./client/auth";
import { ImageService } from "./client/images/ImageService";
import { ImageController } from "./controllers/ImageController";
import { CommentService } from "./client/comments/CommentService";
import { CommentController } from "./controllers/CommentController";

/**
 * Class containing the application server logic
 */
export default class Server {

    /**
     * Koa instance
     */
    public readonly app: Koa;

    /**
     * Router instance
     */
    public readonly router: Router;

    /**
     * Logger of the application server
     */
    public readonly logger: pino.Logger;

    constructor(logger: pino.Logger) {
        this.app = new Koa();
        this.router = new Router();
        this.logger = logger;
    }

    /**
     * Configure the application middleware.
     */
    public configure() {
        this.app
            .use(middlewareLogger({
                level: process.env.NODE_ENV === "development" ? "debug" : "info"
            }))
            .use(bodyParser())
            .use(async (ctx: ParameterizedContext<RouterContext>, next) => {
                try {
                    await next();
                } catch (e) {
                    let error: RequestError;
                    if (e.name === RequestError.NAME) {
                        error = e;
                    } else {
                        this.logger.error(e);
                        error = new RequestError(500);
                    }
                    const { status, timestamp, message, data } = error;
                    ctx.status = status;
                    ctx.body = {
                        ...data,
                        status,
                        timestamp,
                        message,
                    };
                }
            });
    }

    /**
     * Bind controller routes into the application.
     *
     * @param authService Implementation for `AuthService`
     * @param imageService image service
     * @param commenService comment service
     */
    public bindRoutes(
        authService: AuthService,
        imageService: ImageService,
        commentService: CommentService
    ) {
        const authController = new AuthController(authService);
        authController.bind(this.router);
        const imageController = new ImageController(imageService);
        imageController.bind(this.router);
        const commentController = new CommentController(commentService);
        commentController.bind(this.router);

        this.app
            .use(this.router.routes())
            .use(this.router.allowedMethods());
    }
}
