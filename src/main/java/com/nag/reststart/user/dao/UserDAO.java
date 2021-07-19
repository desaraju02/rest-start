package com.nag.reststart.user.dao;

import com.nag.reststart.user.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDAO {
    private static List<User> users = new ArrayList<>();
    private static int userId = 3;

    static {
        users.add(new User(1,"Gan", new Date()));
        users.add(new User(2,"Shiv", new Date()));
        users.add(new User(3,"Gayatri", new Date()));
    }

    public User saveUser(User user){
        if(user.getId() == null){
            user.setId(++userId);
        }
        users.add(user);
        return user;
    }

    public List<User> findAll(){
        return users;
    }

    public User findUserById(int id){
        for(User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

}
