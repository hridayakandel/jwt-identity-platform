package com.edu.jwtplatformnew.service;


import com.edu.jwtplatformnew.dto.UserDto;
import com.edu.jwtplatformnew.model.LoginRequest;
import com.edu.jwtplatformnew.model.LoginResponse;

public interface UaaService {
    LoginResponse signIn(LoginRequest loginRequest);
    void signUp(UserDto userDto);
}
