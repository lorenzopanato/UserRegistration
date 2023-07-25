package com.example.userRegistration.controller;

import com.example.userRegistration.user.User;
import com.example.userRegistration.user.UserRegistrationDTO;
import com.example.userRegistration.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody UserRegistrationDTO data) {
        repository.save(new User(data));
    }

}
