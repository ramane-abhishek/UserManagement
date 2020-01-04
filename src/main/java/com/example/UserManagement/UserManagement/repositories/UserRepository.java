package com.example.UserManagement.UserManagement.repositories;

import com.example.UserManagement.UserManagement.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User save(User u);
    User findByid(Long id);
    User findByUsername(String username);

}
