package com.pickpoke.api.controller;

import com.pickpoke.api.entity.Post;
import com.pickpoke.api.entity.User;
import com.pickpoke.api.service.PostService;
import com.pickpoke.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService; 

    @GetMapping("/getAllUsers")
    public List<User> getAllUser() {
        return this.userService.getAllUser();
    }

    @GetMapping("/getUserByTag")
    public User getUserByTag(@RequestParam("tag") String tag) {
        return this.userService.getByTag(tag);
    }

    @GetMapping("/getPostsByUser")
    public List<Post> getPostByUserTag(@RequestParam("tag") String tag) {
       return this.postService.getPostByTag(tag); 
    }
 
}
