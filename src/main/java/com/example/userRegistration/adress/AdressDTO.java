package com.example.userRegistration.adress;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AdressDTO(
        @NotBlank String street,
        @NotBlank String neighborhood,
        @NotNull Integer number) {
}
