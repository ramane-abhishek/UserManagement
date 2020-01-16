package com.example.UserManagement.service;

import com.example.UserManagement.entities.Role;
import com.example.UserManagement.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public Role addRole(Role r) {
        return repository.save(r);
    }

    public Role getRoleByid(Long id) {
        return repository.findByid(id);
    }

    public Role getRoleByrole(String role) {
        return repository.findByrole(role);
    }
}
