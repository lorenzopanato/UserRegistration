package com.example.userRegistration.user;

import com.example.userRegistration.adress.Adress;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Embedded
    private Adress adress;

    public User(UserRegistrationDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.adress = new Adress(data.adress());
    }

    public void updateInfo(UserUpdateDTO data) {
        this.name = data.name();
        this.adress = new Adress(data.adress());
    }
}
