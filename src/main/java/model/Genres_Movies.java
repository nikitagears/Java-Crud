package model;
@Entity
name = "genres_movies"
public class Genres_Movies
{
    @column (name = "id_genre", nullable = false)
    private Integer id_genre;

    @column (name = "id_movie", nullable = false)
    private Integer id_movie;

}