package com.example.UserManagement.UserManagement.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Getter
@Setter
public class UserBasic extends BaseEntity {

    @Column
    private String name;
    @Column
    private int age;

}
