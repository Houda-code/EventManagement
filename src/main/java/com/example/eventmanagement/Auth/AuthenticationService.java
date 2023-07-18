package com.example.eventmanagement.Auth;
import com.example.eventmanagement.Entities.Role;
import com.example.eventmanagement.Entities.User;
import com.example.eventmanagement.Repositories.UserRepository;
import com.example.eventmanagement.config.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.io.IOException;
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;
    public AuthenticationResponse register(RegisterRequest request) {
       User user = User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .numTel(request.getNumTel())
               .role(request.getRole())
               .password(passwordEncoder.encode(request.getPassword()))

                .build();
        repository.save(user);
       var jwtToken=jwtService.generateToken(user);
       return AuthenticationResponse.builder()
               .token(jwtToken)
               .build();

    }
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user =repository.findUserByEmail(request.getEmail());
        var jwtToken=jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }
}
