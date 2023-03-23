package com.edu.jwtplatformnew.controller;

import com.edu.jwtplatformnew.dto.UserDto;
import com.edu.jwtplatformnew.model.LoginRequest;
import com.edu.jwtplatformnew.model.LoginResponse;
import com.edu.jwtplatformnew.model.ValidateTokenResponse;
import com.edu.jwtplatformnew.service.UaaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/uaa")
@RestController
@CrossOrigin
public class UaaController {

    public final UaaService uaaService;
    @PostMapping("/signup")
    //TODO:Hridaya "Complete Signup"
    public void signup(@RequestBody UserDto user){
        uaaService.signUp(user);
    }
    @PostMapping("/signin")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return uaaService.signIn(loginRequest);
    }
    @GetMapping("/token/validate")
    public ResponseEntity<ValidateTokenResponse> isValidToken(Authentication authentication){
        return ResponseEntity.ok(buildResponse(authentication));
    }

    private ValidateTokenResponse buildResponse(Authentication authentication) {
        List<String> roles= new ArrayList<>();
        ValidateTokenResponse validateTokenResponse= new ValidateTokenResponse();
        authentication.getAuthorities().forEach(grantedAuthority -> {
            roles.add(grantedAuthority.getAuthority());
        });
        validateTokenResponse.setRoles(roles);
        validateTokenResponse.setEmail(authentication.getName());
        return validateTokenResponse;
    }
}
