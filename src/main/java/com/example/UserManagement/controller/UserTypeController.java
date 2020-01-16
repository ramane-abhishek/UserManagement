package com.example.UserManagement.controller;

import com.example.UserManagement.entities.UserType;
import com.example.UserManagement.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user_type")
public class UserTypeController {

    @Autowired
    private UserTypeService service;

    @PostMapping
    public UserType addUserType(@RequestBody UserType type){
        return service.addUserType(type);
    }

    @GetMapping
    public String getUserType(){
        return "Get UserType";
    }
}
