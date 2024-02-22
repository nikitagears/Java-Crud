package com.example.javadocker.live.model;
import jakarta.persistence.*;

import java.util.Set;

@Table(name = "movies")

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie", nullable = false)
    private Integer idMovie;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "release_date", nullable = false)
    private Integer releaseDate;

    @Column(name = "desciption", nullable = false)
    private String desciption;

    @Column(name = "rating", nullable = false)
    private Double rating;

    @OneToMany(mappedBy="movie")
    private Set<Character> characters;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "genres_movies",
            joinColumns = @JoinColumn(name = "id_movie"),
            inverseJoinColumns = @JoinColumn(name = "id_genre")
    )
    private Set<Genre> genres;





    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }



}
