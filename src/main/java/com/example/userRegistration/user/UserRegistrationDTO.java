package com.example.userRegistration.user;

import com.example.userRegistration.adress.AdressDTO;

public record UserRegistrationDTO(String name, String email, AdressDTO adress) {
}
