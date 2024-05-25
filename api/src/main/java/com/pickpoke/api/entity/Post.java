package com.pickpoke.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private String postId;
    private PostDetails postDetails;
    private String userTag;
    private List<Comment> commentList;
    private Integer likes;
}
