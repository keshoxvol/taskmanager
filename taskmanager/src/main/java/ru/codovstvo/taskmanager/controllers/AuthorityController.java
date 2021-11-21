package ru.codovstvo.taskmanager.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.codovstvo.taskmanager.Service.UserService;
import ru.codovstvo.taskmanager.dto.AuthRequestDto;
import ru.codovstvo.taskmanager.entitydb.UserEntity;
import ru.codovstvo.taskmanager.security.JwtTokenProvider;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/auth/")
public class AuthorityController {
    private JwtTokenProvider jwtTokenProvider;
    private UserService userService;

    @Autowired
    public AuthorityController(JwtTokenProvider jwtTokenProvider, UserService userService) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody AuthRequestDto requestDto) {
        String username = requestDto.getUsername();
        UserEntity user = userService.findByUsername(username);
        if(user != null){
            String token = jwtTokenProvider.createToken(username, user.getRoles());
            Map<Object, Object> response = new HashMap<>();
            response.put("username", username);
            response.put("token", token);
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User Not found");
    }

    @PostMapping("register")
    public ResponseEntity register(@RequestBody AuthRequestDto requestDto) {
        String username = requestDto.getUsername();
        UserEntity user = userService.findByUsername(username);
        if (user == null){
            userService.register(new UserEntity(username, requestDto.getPassword(), requestDto.getEmail()));
            return ResponseEntity.ok(1);
        } else {
            return ResponseEntity.badRequest().body("Username used");
        }
    }

    @GetMapping(value="test")
    public ResponseEntity test() {
        return ResponseEntity.ok(1);
    }
    

}