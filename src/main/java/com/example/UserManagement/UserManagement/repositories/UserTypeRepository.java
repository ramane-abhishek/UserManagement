package com.example.UserManagement.UserManagement.repositories;

import com.example.UserManagement.UserManagement.entities.UserType;
import org.springframework.data.repository.CrudRepository;

public interface UserTypeRepository extends CrudRepository<UserType,Long> {

    UserType save(UserType type);
    UserType findByid(Long id);

}
