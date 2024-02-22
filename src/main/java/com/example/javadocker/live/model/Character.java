package com.example.javadocker.live.model;
import jakarta.persistence.*;

@Table(name = "characters")

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_character", nullable = false)
    private Integer idCharacter;

    @Column(name = "character_name", nullable = false)
    private String characterName;

    @ManyToOne
    @JoinColumn(name = "id_actor")
    private Actor actor;

    @ManyToOne
    @JoinColumn(name = "id_movie")
    private Movie movie;






    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Integer getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Integer idCharacter) {
        this.idCharacter = idCharacter;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

}
