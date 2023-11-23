package com.example.cinemagic.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
@Table(name = "cinemashow")
public class CinemaShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CinemaShow")
    private int idCinema;
    @Column(name = "ID_Movie")
    @OneToMany
    private int idMovie;
    @NotEmpty(message = "Date can't be empty")
    @NotNull(message = "Date can't be null")
    @Column(name = "Date")
    private String date;
    @NotEmpty(message = "Schedule can't be empty")
    @NotNull(message = "Schedule can't be null")
    @Column(name = "Schedule")
    private String schedule;
    @NotEmpty(message = "CInema room can't be empty")
    @NotNull(message = "Cinema room can't be null")
    @Column(name = "Cinema_Room")
    private int cinemaRoom;
    @NotEmpty(message = "Seats can't be empty")
    @NotNull(message = "Seats can't be null")
    @Column(name = "Seats")
    private int seats;

    public CinemaShow(int idCinema, int idMovie, String date, String time, int cinesShow, int seats) {
        this.idCinema = idCinema;
        this.idMovie = idMovie;
        this.date = date;
        this.schedule = time;
        this.cinemaRoom = cinesShow;
        this.seats = seats;
    }
}
