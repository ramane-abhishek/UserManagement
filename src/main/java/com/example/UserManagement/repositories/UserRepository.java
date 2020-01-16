package com.example.UserManagement.repositories;

import com.example.UserManagement.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {

    User save(User u);
    User findByid(Long id);
    User findByUsername(String username);

}
