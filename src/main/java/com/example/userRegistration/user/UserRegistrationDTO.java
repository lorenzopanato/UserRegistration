package com.example.userRegistration.user;

import com.example.userRegistration.adress.AdressDTO;

public record UserRegistrationDTO(Long id, String name, String email, AdressDTO adress) {
}
