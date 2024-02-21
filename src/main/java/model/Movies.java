package model;
@Entity
name = "movies"
public class Movies
{
    @column
            (
                    @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
            )
    private Long id_movie;

    @column (name = "title", nullable = false)
    private String title;

    @column (name = "release_date")
    private Integer release_Date;

    @column (name = "description", nullable = false)
    private String description;

    @column (name = "rating")
    private Double rating;
}