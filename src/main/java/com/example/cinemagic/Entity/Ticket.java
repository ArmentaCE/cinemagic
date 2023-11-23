package com.example.cinemagic.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Ticket")
    private int idTicket;
    @NotEmpty(message = "Id cinema can't be empty")
    @NotNull(message = "Id cinema can't be null")
    @OneToOne
    @Column(name = "ID_Cinema")
    private int idCinema;
    @NotEmpty(message = "Id user can't be empty")
    @NotNull(message = "Id user can't be null")
    @Column(name = "ID_User")
    @OneToOne
    private int idUser;
    @NotEmpty(message = "Seats can't be empty")
    @NotNull(message = "Seats can't be null")
    @Column(name = "Seats")
    private int seats;
    @NotEmpty(message = "Price can't be empty")
    @NotNull(message = "Price can't be null")
    @Column(name = "Price")
    private float price;
    @NotEmpty(message = "Payment Details can't be empty")
    @NotNull(message = "Payment Details can't be null")
    @Column(name = "PaymentDetails")
    private String paymentDetails;

    public Ticket(int idTicket, int idCinema, int idUser, int seats, float price, String paymentDetails) {
        this.idTicket = idTicket;
        this.idCinema = idCinema;
        this.idUser = idUser;
        this.seats = seats;
        this.price = price;
        this.paymentDetails = paymentDetails;
    }
}
