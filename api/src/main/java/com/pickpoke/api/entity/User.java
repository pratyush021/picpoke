package com.pickpoke.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String name;
    private String email;
    private String profilePic;
    private String userTag;
    private List<Post> postList;

}
