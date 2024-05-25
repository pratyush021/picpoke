package com.pickpoke.api.controller;

import com.pickpoke.api.entity.User;
import com.pickpoke.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUser() {
        return this.userService.getAllUser();
    }


}
