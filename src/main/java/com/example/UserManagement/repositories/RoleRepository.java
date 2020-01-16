package com.example.UserManagement.repositories;

import com.example.UserManagement.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role,Long> {

    Role save(Role r);
    Role findByid(Long id);
    Role findByrole(String role);
    List<Role> findByidIn(List<Long>roleIds);
}
