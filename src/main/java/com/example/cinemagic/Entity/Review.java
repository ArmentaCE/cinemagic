package com.example.cinemagic.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "review")
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Review")
    private int idReview;
    @Column(name = "ID_Movie")
    @NotEmpty(message = "Id movie can't be empty")
    @NotNull(message = "Id movie can't be null")
    @OneToOne
    private int idMovie;
    @Column(name = "ID_User")
    @NotEmpty(message = "Id user can't be empty")
    @NotNull(message = "Id usesr can't be null")
    @OneToOne
    private int idUser;
    @Column(name = "Score")
    @NotEmpty(message = "Score can't be empty")
    @NotNull(message = "Score can't be null")
    private float score;
    @Column(name = "Comment")
    @NotEmpty(message = "Comment can't be empty")
    @NotNull(message = "Comment can't be null")
    private String comment;

    public Review(int idReview, int idMovie, int idUser, float score, String comment) {
        this.idReview = idReview;
        this.idMovie = idMovie;
        this.idUser = idUser;
        this.score = score;
        this.comment = comment;
    }
}
