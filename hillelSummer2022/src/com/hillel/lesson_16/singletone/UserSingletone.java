package com.hillel.lesson_16.singletone;

import java.util.Objects;

public class UserSingletone {
    private static User user;

    private UserSingletone(String user) {
        this.user = new User(user);
    }

    static User getUser(String userName){
        if (Objects.isNull(user)){
            user = new User(userName);
        }
        return user;
    }
}
