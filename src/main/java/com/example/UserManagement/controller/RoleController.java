package com.example.UserManagement.controller;

import com.example.UserManagement.entities.Role;
import com.example.UserManagement.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasRole('ADMIN')")
    public Role addRole(@RequestBody Role r){
        return service.addRole(r);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Role getRoleByid(@PathVariable Long id){
        return service.getRoleByid(id);
    }
}
