package com.example.cinemagic.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Movie")
    private int idMovie;
    @NotEmpty(message = "Title can't be empty")
    @NotNull(message = "Title can't be null")
    @Column(name = "Title")
    private String title;
    @NotEmpty(message = "Description can't be empty")
    @NotNull(message = "Description can't be null")
    @Column(name = "Description")
    private String description;
    @NotEmpty(message = "Duration can't be empty")
    @NotNull(message = "Duration can't be null")
    @Column(name = "Duration")
    private int duration;
    @NotEmpty(message = "Gender can't be empty")
    @NotNull(message = "Gender can't be null")
    @Column(name = "Gender")
    private String gender;
    public Movie(int id, String title, String description, int duration, String gender) {
        this.idMovie = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.gender = gender;
    }
}
