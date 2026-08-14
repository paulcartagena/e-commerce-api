package com.paulcartagena.watchstore.auth.controller;

import com.paulcartagena.watchstore.auth.service.AuthService;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

}
