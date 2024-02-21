package model;
@Entity
name = "actors"
public class Actors
{
    @column
            (
                    @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
            )
    private Long id_actor;

    @column (name = "actor_name", nullable = false)
    private String actor_name;

    @column (name = "gender", nullable = false)
    private String gender;

    @column (name = "birthday", nullable = false)
    private Integer birthday;

}