package org.jojo.w2.controller;

import org.jojo.w2.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestParam String username, @RequestParam String password) {
        final String token = authService.authenticate(username, password);
        return ResponseEntity.ok(token);
    }
}
