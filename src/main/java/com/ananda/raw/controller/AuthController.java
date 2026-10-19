package com.ananda.raw.controller;
import com.ananda.raw.dto.RegisterRequest;
import com.sun.net.httpserver.HttpsConfigurator;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
import com.ananda.raw.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<Void> userRegistration(@Valid @RequestBody RegisterRequest request){
        userService.userRegistration(
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
        );
return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public AuthController(UserService userService) {
        this.userService = userService;
    }
}
