package com.kizza.securitydemo.service;

import com.kizza.securitydemo.auth.AuthenticationResponse;
import com.kizza.securitydemo.auth.RegisterRequest;
import com.kizza.securitydemo.model.AppUser;
import com.kizza.securitydemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;


    public AuthenticationResponse register(RegisterRequest request) {
        // create user save to db and gen token
        var user = AppUser.builder()
                .firstName(request.getFirstName())
                .
    }

    public AuthenticationResponse authenticate(RegisterRequest request) {
    }
}
