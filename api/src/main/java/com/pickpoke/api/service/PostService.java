package com.pickpoke.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.pickpoke.api.entity.Post;
@Service
public class PostService {
    static List<Post> postList = new ArrayList<>(); 

    static {
        postList.add(Post.builder().postId("01").likes(200).userTag("@probohidar").build());
        postList.add(Post.builder().postId("01").likes(200).userTag("@trumph").build());
        postList.add(Post.builder().postId("01").likes(200).userTag("@user1").build());
        postList.add(Post.builder().postId("01").likes(200).userTag("@user1").build());
    }

    public List<Post> getPostByTag(String tag) {
        Assert.notNull(tag, "USER TAG CAN NOT BE NULL");
        Assert.hasLength(tag, "USER TAG INVALID");
        List<Post> sol = new ArrayList<>();         
        for(Post post: postList) {
            if(post.getUserTag().equalsIgnoreCase(tag)) {
                sol.add(post); 
            }
        }
    
        return sol; 
    }
}