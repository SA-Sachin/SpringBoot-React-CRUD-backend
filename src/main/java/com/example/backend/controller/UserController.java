package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin({"http://localhost:3000"})
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public UserController() {
    }

    @PostMapping({"/user"})
    User newUser(@RequestBody User newUser) {
        return (User)this.userRepository.save(newUser);
    }

    @GetMapping({"/users"})
    List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

}
