package com.example.javadocker.live.model;
import jakarta.persistence.*;

@Table(name = "genres")

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genre", nullable = false)
    private Integer idGenre;

    @Column(name = "genre", nullable = false)
    private String genre;

    public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
