package com.example.UserManagement.UserManagement.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @CreationTimestamp
    private Timestamp createTstamp;
    @UpdateTimestamp
    private Timestamp modifiedTstamp;
//    @CreatedBy
//    @LastModifiedBy  to be decided

}
