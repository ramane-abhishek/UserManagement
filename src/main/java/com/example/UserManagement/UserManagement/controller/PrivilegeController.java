package com.example.UserManagement.UserManagement.controller;

import com.example.UserManagement.UserManagement.entities.Privilege;
import com.example.UserManagement.UserManagement.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/privilege")
public class PrivilegeController {

    @Autowired
    private PrivilegeService service;

    @PostMapping
    public Privilege addPrivilege(@RequestBody Privilege p){
        return service.addPrivilege(p);
    }

    @GetMapping("/{id}")
    public Privilege getPrivilegeByid(@PathVariable Long id){
        return service.getPrivilegeByid(id);
    }
}
