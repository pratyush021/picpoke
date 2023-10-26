package com.instagram.api.service;


import com.instagram.api.entity.Post;
import com.instagram.api.entity.User;
import com.instagram.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    public void deleteUser(Integer userid) {
        this.userRepository.deleteById(userid);
    }

    public User updateUser(User user, Integer userid) {
        //object to be updated -> object whose id is "userid"
        User newUser = this.userRepository.findById(userid).get();


        Post post = new Post();


        return newUser;

    }

}
