import { PublicProcedure, router } from "./trpc";
import { z } from "zod";
import { createHTTPServer } from "@trpc/server/adapters/standalone"; 


const postType = z.object({
    caption: z.string(), 
    image: z.string(), 
    postId: z.string(), 
    authorId: z.string()
})

const appRouter  = router({
    createPost: PublicProcedure
        .input(postType)
        .mutation(async (opts) => {
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
            }
        }), 
    getPost: PublicProcedure
        .query(async ()=>{
            return {
                msg: "Fuck steve jobs"
            }
        })
});

const server = createHTTPServer({
    router: appRouter, 
})

server.listen(3000)


export type AppRouter = typeof appRouter; 