package com.example.UserManagement.controller;

import com.example.UserManagement.DTO.UserDTO;
import com.example.UserManagement.entities.User;
import com.example.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignupController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User signUp(@RequestBody UserDTO u){
        return userService.signUp(u.getUsername(),u.getPassword(),u.getRoleIds());
    }

}
