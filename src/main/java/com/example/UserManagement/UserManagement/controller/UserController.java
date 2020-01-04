package com.example.UserManagement.UserManagement.controller;

import com.example.UserManagement.UserManagement.entities.User;
import com.example.UserManagement.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User u){
        return userService.addUser(u);
    }

    @GetMapping("/{id}")
    public User getUserByid(@PathVariable("id")Long id){
        return userService.getUserByid(id);
    }

}
