package com.example.cinemagic.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ID_User")
    private int idUser;
    @NotEmpty(message = "Name can't be empty")
    @NotNull(message = "Name can't be null")
    @Column(name = "Name")
    private String name;
    @NotEmpty(message = "First lastname can't be empty")
    @NotNull(message = "First lastname be null")
    @Column(name = "LastName1")
    private String lastName1;
    @NotEmpty(message = "Second lastname can't be empty")
    @NotNull(message = "Second lastname can't be null")
    @Column(name = "LastName2")
    private String lastName2;
    @NotEmpty(message = "Email can't be empty")
    @NotNull(message = "Email can't be null")
    @Email(message = "Invalid email")
    @Column(name = "Email")
    private String email;
    @NotEmpty(message = "Type of user can't be empty")
    @NotNull(message = "Type of user can't be null")
    @Column(name =  "TypeUser")
    private String typeUser;

    public User(int idUser, String name, String lastName1, String lastName2, String email, String typeUser) {
        this.idUser = idUser;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.email = email;
        this.typeUser = typeUser;
    }
}
