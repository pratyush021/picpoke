package com.pickpoke.api.service;

import com.pickpoke.api.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(User.builder().userTag("@probohidar").email("probohidar2016@gmail.com").name("Pratyush Ranjan Bohidar").build());
        userList.add(User.builder().userTag("@trumph").email("dtrumph2024@gmail.com").name("Donald Trumph").build());
        userList.add(User.builder().userTag("@NaMo").email("modddie2024@gmail.com").name("Harendra Modi").build());
        userList.add(User.builder().userTag("@rgandhi").email("rahulGandi@gmail.com").name("Rahul Gandhi").build());
    }

    public List<User> getAllUser() {
        return this.userList;
    }

    public User getByTag(String tag) {
        if(userList != null) {
            for (User user : userList) {
                if (user.getUserTag().equals(tag)) {
                    return user;
                }
            }
        }
        return User.builder().build();
    }


}
