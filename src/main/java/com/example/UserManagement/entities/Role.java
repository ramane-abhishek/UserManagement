package com.example.UserManagement.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Role extends BaseEntity implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String role;

    @Column
    private String description;


    @Override
    public String getAuthority() {
        return role;
    }

    public Role(){
        super();
    }
    public Role(String rolename,String description){
        this.role=rolename;
        this.description=description;
    }
}
