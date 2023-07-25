package com.example.userRegistration.user;

import com.example.userRegistration.adress.AdressDTO;

public record UserUpdateDTO(Long id, String name, AdressDTO adress) {
}
