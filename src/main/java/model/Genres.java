package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
name = "genres"
public class Genres
{
    @column
            (
                    @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
            )
    private Long id_genre;

    @column (name = "genre", nullable = false)
    private String genre;

}