package com.example.cinemagic.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.OnError;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTransaction;
    @Column(name = "ID_User")
    @OneToOne
    @NotEmpty(message = "Id user can't be empty")
    @NotNull(message = "Id user  can't be null")
    private int idUser;
    @OneToOne
    @Column(name = "ID_Movie")
    @NotEmpty(message = "Id movie can't be empty")
    @NotNull(message = "Id movie can't be null")
    private int idMovie;
    @Column(name = "Schedule")
    @NotEmpty(message = "Schedule can't be empty")
    @NotNull(message = "Schedule can't be null")
    private String schedule;
    @Column(name = "Seats")
    @NotEmpty(message = "Seats can't be empty")
    @NotNull(message = "Seats can't be null")
    private int seats;
    @Column(name = "Details")
    @NotEmpty(message = "Details can't be empty")
    @NotNull(message = "Details can't be null")
    private String details;

    public Transaction(int idTransaction, int idUser, int idMovie, String schedule, int seats, String details) {
        this.idTransaction = idTransaction;
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.schedule = schedule;
        this.seats = seats;
        this.details = details;
    }
}
