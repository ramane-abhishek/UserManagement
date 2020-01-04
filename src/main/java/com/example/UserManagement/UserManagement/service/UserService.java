package com.example.UserManagement.UserManagement.service;

import com.example.UserManagement.UserManagement.entities.User;
import com.example.UserManagement.UserManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User u){
        return userRepository.save(u);
    }

    public User getUserByid(Long id) {
        return userRepository.findByid(id);
    }
}
