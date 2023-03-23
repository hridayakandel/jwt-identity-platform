package com.edu.jwtplatformnew.service.impl;

import com.edu.jwtplatformnew.dto.UserDto;
import com.edu.jwtplatformnew.entity.User;
import com.edu.jwtplatformnew.model.LoginRequest;
import com.edu.jwtplatformnew.model.LoginResponse;
import com.edu.jwtplatformnew.repository.UserRepo;
import com.edu.jwtplatformnew.security.JwtHelper;
import com.edu.jwtplatformnew.service.UaaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
@RequiredArgsConstructor
public class UaaServiceImpl implements UaaService {

    private final ModelMapper modelMapper;
    private final UserRepo userRepo;
    private final AuthenticationManager authenticationManager;
    private final JwtHelper jwtHelper;

    @Override
    public LoginResponse signIn(LoginRequest loginRequest) {
        try {
            //sending username and password to Spring Authentication Manager
            // Auth manager validate the userName and password by calling the method "loadUserByUserName"
            // inside AwesomeUserDetailsService Class (this class is implementing UserDetails Service provide by spring)
           Authentication authentication= authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
            // if authenticated then it will call jwtHelper to get the token
            final String accessToken = jwtHelper.generateToken(loginRequest.getEmail());
            return new LoginResponse(accessToken, "");
        } catch (BadCredentialsException e) {
            return new LoginResponse("", "");
        }
    }

    @Override
    public void signUp(UserDto userDto) {
        //encode password to store in db
        String encoded = Base64.getEncoder().encodeToString(userDto.getPassword().getBytes());
        userDto.setPassword(encoded);
        userRepo.save(modelMapper.map(userDto, User.class));
    }
}
