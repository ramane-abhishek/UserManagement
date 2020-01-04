package com.example.UserManagement.UserManagement.controller;

import com.example.UserManagement.UserManagement.entities.Role;
import com.example.UserManagement.UserManagement.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @PostMapping
    public Role addRole(@RequestBody Role r){
        return service.addRole(r);
    }

    @GetMapping("/{id}")
    public Role getRoleByid(@PathVariable Long id){
        return service.getRoleByid(id);
    }
}
