package ru.codovstvo.taskmanager.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.Service.UserService;
import ru.codovstvo.taskmanager.dto.AuthenticationRequestDto;
import ru.codovstvo.taskmanager.dto.RegistrationRequestDto;
import ru.codovstvo.taskmanager.entitydb.UserEntity;
import ru.codovstvo.taskmanager.security.JwtTokenProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/auth/")
public class AuthorityController {
    private AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;
    private UserService userService;

    @Autowired
    public AuthorityController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody AuthenticationRequestDto requestDto) {
        
        String username = requestDto.getUsername();
        UserEntity user = userService.findByUsername(username);
        String token = jwtTokenProvider.createToken(username, user.getRoles());

        Map<Object, Object> response = new HashMap<>();
        response.put("username", username);
        response.put("token", token);

        return ResponseEntity.ok(response);
    }

    @PostMapping("register")
    public ResponseEntity register(@RequestBody RegistrationRequestDto requestDto) {
        userService.register(new UserEntity(requestDto.getUsername(), requestDto.getPassword()));
        return ResponseEntity.ok(1);
    }

    @GetMapping(value="test")
    public ResponseEntity test() {
        return ResponseEntity.ok(1);
    }
    

}