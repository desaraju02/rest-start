package com.nag.reststart.user;

import com.nag.reststart.user.dao.UserDAO;
import com.nag.reststart.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDAO userDAO;

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id){
        return userDAO.findUserById(id);
    }

    @GetMapping(path="/users")
    public List<User> getAllUsers(){
        return userDAO.findAll();
    }

    @PostMapping(path = "/users")
    public User saveUser(@RequestBody User user){
        return userDAO.saveUser(user);
    }
}
