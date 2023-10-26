package com.instagram.api.entity;


import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;
import java.util.List;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    private String username;
    private String password;


    private String profilePicture;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> postList;


    public User() {
    }

    public User(Integer userid, String username, String password, String profilePicture, List<Post> postList) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.profilePicture = profilePicture;
        this.postList = postList;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
