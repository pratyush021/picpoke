import { createTRPCProxyClient, httpBatchLink } from '@trpc/client';
import type { AppRouter } from '../server';


const trpc = createTRPCProxyClient<AppRouter>({
  links: [
    httpBatchLink({
      url: 'http://localhost:3000',
    }),
  ],

});

async function add() {
    let response = await trpc.createPost.mutate({
        caption: "Fuck microsoft", 
        image: "google,com",
        postId: "21", 
        authorId: "22"
    })
    console.log(response); 
}

add(); 