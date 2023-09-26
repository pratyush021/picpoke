"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const trpc_1 = require("./trpc");
const zod_1 = require("zod");
const standalone_1 = require("@trpc/server/adapters/standalone");
const postType = zod_1.z.object({
    caption: zod_1.z.string(),
    image: zod_1.z.string(),
    postId: zod_1.z.string(),
    authorId: zod_1.z.string()
});
const appRouter = (0, trpc_1.router)({
    createPost: trpc_1.PublicProcedure
        .input(postType)
        .mutation((opts) => __awaiter(void 0, void 0, void 0, function* () {
        const caption = opts.input.caption;
        const image = opts.input.image;
        const postId = opts.input.postId;
        const authorId = opts.input.authorId;
        //do db stuff here
        return {
            id: "1",
            caption: caption,
            image: image,
            postId: postId,
            authorId: authorId
        };
    })),
    getPost: trpc_1.PublicProcedure
        .query(() => __awaiter(void 0, void 0, void 0, function* () {
        return {
            msg: "Fuck steve jobs"
        };
    }))
});
const server = (0, standalone_1.createHTTPServer)({
    router: appRouter,
});
server.listen(3000);
