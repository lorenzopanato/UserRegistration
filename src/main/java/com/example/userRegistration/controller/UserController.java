package com.example.userRegistration.controller;

import com.example.userRegistration.user.User;
import com.example.userRegistration.user.UserRegistrationDTO;
import com.example.userRegistration.user.UserRepository;
import com.example.userRegistration.user.UserUpdateDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid UserRegistrationDTO data) {
        repository.save(new User(data));
    }

    @GetMapping
    public List<User> getAll() {
        return repository.findAll();
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UserUpdateDTO data) {
        var user = repository.getReferenceById(data.id());
        user.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
