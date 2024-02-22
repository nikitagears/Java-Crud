package model;
import jakarta.persistence.*;
import jakarta.persistence.UniqueConstraint;

@Table(
        name = "genres_movies", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_genre"})}
)

@Entity
public class genres_movies {

    @Column(name = "id_genre", nullable = false)
    private String id_genre;
    @Column(name = "id_movie", nullable = false)
    private String id_movie;

}
