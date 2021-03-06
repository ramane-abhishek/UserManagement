package com.example.UserManagement.UserManagement.service;

import com.example.UserManagement.UserManagement.entities.UserType;
import com.example.UserManagement.UserManagement.repositories.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTypeService {

    @Autowired
    private UserTypeRepository repository;

    public UserType addUserType(UserType type){
        return repository.save(type);
    }
}
