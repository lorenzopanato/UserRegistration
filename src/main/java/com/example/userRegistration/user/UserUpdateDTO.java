package com.example.userRegistration.user;

import com.example.userRegistration.adress.AdressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserUpdateDTO(
        @NotNull Long id,
        @NotBlank String name,
        @NotNull @Valid AdressDTO adress) {
}
