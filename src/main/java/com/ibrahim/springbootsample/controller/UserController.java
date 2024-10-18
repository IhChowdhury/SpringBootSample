package com.ibrahim.springbootsample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser() {
        return ResponseEntity.ok("User created");
    }

    @GetMapping("{userId}")
    public ResponseEntity<String> getUser(@PathVariable(name = "userId") int userId) {
        return ResponseEntity.ok("User");
    }

}
