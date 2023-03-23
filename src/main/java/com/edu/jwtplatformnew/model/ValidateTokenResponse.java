package com.edu.jwtplatformnew.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidateTokenResponse {
    private List<String> roles;

    private String email;
}
