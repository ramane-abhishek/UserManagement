package com.example.UserManagement.UserManagement.repositories;

import com.example.UserManagement.UserManagement.entities.Privilege;
import org.springframework.data.repository.CrudRepository;

public interface PrivilegeRepository extends CrudRepository<Privilege,Long> {

    Privilege save(Privilege p);
    Privilege findByid(Long id);
    Privilege findByprivilege(String privilege);

}
