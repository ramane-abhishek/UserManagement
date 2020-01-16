package com.example.UserManagement.DTO;

import com.example.UserManagement.entities.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    private String username;
    private String password;
    private List<Long> roleIds;
}
