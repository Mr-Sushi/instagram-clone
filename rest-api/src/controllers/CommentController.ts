import { CommentService } from "../client/comments/CommentService";
import Router = require("@koa/router");
import { IValidationState, validationResults } from "koa-req-validation";
import { IController } from "./Controller";
import { CreateCommentError } from "../client/comments/errors/CreateCommentError";
import { CreateCommentErrorStatus, GetCommentErrorStatus, DeleteCommentErrorStatus } from "../client/generated/comment_service_pb";
import { RequestError } from "../lib/RequestError";
import { GetCommentError } from "../client/comments/errors/GetCommentError";
import { DeleteCommentError } from "../client/comments/errors/DeleteCommentError";
import { GetCommentsByTagError } from "../client/comments/errors/GetCommentsByTagError";
import { GetCommentsByUserTagError } from "../client/comments/errors/GetCommentsByUserTagError";

export class CommentController implements IController {

    private commentService: CommentService;

    public constructor(commentService: CommentService) {
        this.commentService = commentService;
    }

    bind = (router: Router, basePath = "/comments"): void => {
        router.post(
            basePath,
            this.postComment
        );
        router.get(
            `${basePath}/:commentId`,
            this.getComment
        );
        router.delete(
            `${basePath}/:commentId`,
            this.deleteComment
        );
        router.get(
            `${basePath}/tag/:tag`,
            this.getCommentsByTag
        );
        router.get(
            `${basePath}/userTag/:tag`,
            this.getCommentsByUserTag
        );
    }

    private postComment = async (ctx: Router.RouterContext<IValidationState>) =>  {
        const results = validationResults(ctx);
        if (results.hasErrors()) {
            throw new RequestError(422, { errors: results.array() });
        }
        const { content, userId, imageId, tags, userTags }= ctx.request.body;
        try {
            const response = await this.commentService.createComment(
                content,
                userId,
                imageId,
                tags,
                userTags
                );
            ctx.body = response;
            ctx.status = 201;
        } catch (e) {
            if (e instanceof CreateCommentError) {
                switch (e.status) {
                    case CreateCommentErrorStatus.CREATE_INVALID_PARAMETER:
                        throw new RequestError(400, "Inavild parameter");
                    case CreateCommentErrorStatus.CREATE_SERVER_ERROR:
                    default:
                        ctx.log.warn(e);
                        throw new RequestError(500);
                }
            }
            ctx.log.error(e);
            throw new RequestError(503);
        }
    }

    private getComment = async (ctx: Router.RouterContext<IValidationState>) => {
        const results = validationResults(ctx);
        if (results.hasErrors()) {
            throw new RequestError(422, { errors: results.array() });
        }
        const { commentId } = ctx.params;
        try {
            const response = await this.commentService.getComment(commentId);
            ctx.body = response;
            ctx.status = 200;
        } catch (e) {
            if (e instanceof GetCommentError) {
                switch (e.status) {
                    case GetCommentErrorStatus.GET_NOT_FOUND:
                        throw new RequestError(404, `No comment found with id ${commentId}`);
                    default:
                        ctx.log.warn(e);
                        throw new RequestError(500);
                }
            }
            ctx.log.error(e);
            throw new RequestError(503);
        }
    }

    private deleteComment = async (ctx: Router.RouterContext<IValidationState>) => {
        const results = validationResults(ctx);
        console.log("Get comments by tag");
        if (results.hasErrors()) {
            throw new RequestError(422, { errors: results.array() });
        }
        const { commentId } = ctx.params;
        try {
            const response = await this.commentService.deleteComment(commentId);
            ctx.body = response;
            ctx.status = 200;
        } catch (e) {
            if (e instanceof DeleteCommentError) {
                switch(e.status) {
                    case DeleteCommentErrorStatus.DELETE_NOT_FOUND:
                        throw new RequestError(404, `No comment found with id ${commentId}`);
                    default:
                        ctx.log.warn(e);
                        throw new RequestError(500);
                }
            }
            ctx.log.error(e);
            throw new RequestError(500);
        }
    }

    private getCommentsByTag = async (ctx: Router.RouterContext<IValidationState>) => {
        const results = validationResults(ctx);
        console.log("Get comments by tag");
        if (results.hasErrors()) {
            throw new RequestError(422, { errors: results.array() });
        }
        const { tag } = ctx.params;
        try {
            const response = await this.commentService.getCommentsByHashTag(tag);
            ctx.body = response;
            ctx.status = 200;
        } catch (e) {
            if (e instanceof GetCommentsByTagError) {
                switch(e.status) {
                    default:
                        throw new RequestError(500);
                }
            }
            ctx.log.error(e);
            throw new RequestError(500);
        }
    }

    private getCommentsByUserTag =
        async (ctx: Router.RouterContext<IValidationState>) => {
            const results = validationResults(ctx);
            if (results.hasErrors()) {
                throw new RequestError(422, { errors: results.array() });
            }
            const { tag } = ctx.params;
            try {
                const response = await this.commentService.getCommentsByUserTag(tag);
                ctx.body = response;
                ctx.status = 200;
            } catch (e) {
                if (e instanceof GetCommentsByUserTagError) {
                    switch(e.status) {
                        default:
                            throw new RequestError(500);
                    }
                }
                ctx.log.error(e);
                throw new RequestError(500);
            }
    }
}