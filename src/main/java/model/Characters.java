package model;
@Entity
name = "characters"
public class Characters
{
    @column
            (
                    @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
            )
    private Long id_character;

    @column (name = "character_name", nullable = false)
    private String character_name;

    @column (name = "id_movie", nullable = false)
    private Integer id_movie;

    @column (name = "id_actor", nullable = false)
    private Integer id_actor;

}