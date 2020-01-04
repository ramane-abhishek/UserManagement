package com.example.UserManagement.UserManagement.service;

import com.example.UserManagement.UserManagement.entities.Privilege;
import com.example.UserManagement.UserManagement.repositories.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService {

    @Autowired
    private PrivilegeRepository repository;

    public Privilege addPrivilege(Privilege p){
        return repository.save(p);
    }

    public Privilege getPrivilegeByid(Long id){
        return repository.findByid(id);
    }

    private Privilege getPrivilegeByprivilege(String privilege){
        return repository.findByprivilege(privilege);
    }

}
