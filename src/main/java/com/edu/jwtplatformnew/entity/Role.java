package com.edu.jwtplatformnew.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Role {
    @Id
    private int id;
    private String role;
}
