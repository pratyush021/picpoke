package com.instagram.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postid;

    private String imageLink;
    private String caption;

    private Integer likes;

    private List<String> comments;

    @ManyToOne
    @JoinColumn(name="userid")
    User user;

    public void addPost(Post post) {
        this.caption = post.caption;
        this.imageLink = post.imageLink;
        this.likes = post.likes;
        this.comments = post.comments;

    }
}
