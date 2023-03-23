package com.edu.jwtplatformnew.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private List<RoleDto> roles;
}
