package com.edu.jwtplatformnew.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String accessToken;
    //TODO: Hridaya - Complete the refresh token workflow
    private String refreshToken;
}
