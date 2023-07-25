package com.example.userRegistration.adress;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Adress {

    private String street;
    private String neighborhood;
    private Integer number;

    public Adress(AdressDTO data) {
        this.street = data.street();
        this.neighborhood = data.neighborhood();
        this.number = data.number();
    }
}
