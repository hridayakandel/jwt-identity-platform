package com.edu.jwtplatformnew.controller;

import com.edu.jwtplatformnew.dto.UserDto;
import com.edu.jwtplatformnew.model.LoginRequest;
import com.edu.jwtplatformnew.model.LoginResponse;
import com.edu.jwtplatformnew.service.UaaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/uaa")
@RestController
@CrossOrigin
public class UaaController {

    public final UaaService uaaService;
    @PostMapping("/signup")
    public void signup(@RequestBody UserDto user){
        uaaService.signUp(user);
    }
    @PostMapping("/signin")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return uaaService.signIn(loginRequest);
    }
    @GetMapping("/token/validate")
    public ResponseEntity<Boolean> isValidToken(){
        return ResponseEntity.ok(true);
    }
}
