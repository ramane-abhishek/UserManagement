package com.example.UserManagement.UserManagement.repositories;

import com.example.UserManagement.UserManagement.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {

    Role save(Role r);
    Role findByid(Long id);
    Role findByrole(String role);
}
