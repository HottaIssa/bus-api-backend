package com.saihoz.buses.service;

import com.saihoz.buses.dto.AuthRequest;
import com.saihoz.buses.dto.AuthResponse;
import com.saihoz.buses.model.RoleUser;
import com.saihoz.buses.model.User;
import com.saihoz.buses.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    public AuthResponse login(AuthRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

        User user = userRepository.findByEmail(request.getEmail()).orElseThrow(
                ()-> new RuntimeException("User not found")
        );

        String token = jwtService.generateToken(user);

        return new AuthResponse(token);
    }

    public AuthResponse register(AuthRequest request){
        if(userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("User already exists");
        }


        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(RoleUser.ROLE_USER);
        userRepository.save(user);

        String token = jwtService.generateToken(user);

        return new AuthResponse(token);
    }

}
