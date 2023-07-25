package com.example.userRegistration.user;

import com.example.userRegistration.adress.AdressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRegistrationDTO(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotNull @Valid AdressDTO adress) {
}
