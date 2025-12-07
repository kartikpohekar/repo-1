package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.beans.AuthenticationRequest;
import com.example.beans.AuthenticationResponse;
import com.example.beans.User;
import com.example.security.JwtUtil;
import com.example.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService service;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User u) {
        return service.registerUser(u);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequest req) {

        User user = service.loginUser(req.getUsername(), req.getPassword());

        if (user == null) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }

        String token = jwtUtil.generateToken(user.getUsername());
        AuthenticationResponse response = new AuthenticationResponse(token);

        return ResponseEntity.ok(response);
    }
}
