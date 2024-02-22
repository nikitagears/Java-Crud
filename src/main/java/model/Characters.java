package model;
import jakarta.persistence.*;
import jakarta.persistence.UniqueConstraint;

@Table(
        name = "characters", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_character"})}
)

@Entity
public class characters {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id_character;

    @Column(name = "character_name", nullable = false)
    private String character_name;

    @Column(name = "id_movie", nullable = false)
    private Integer id_movie;

    @Column(name = "id_actor", nullable = false)
    private Integer id_actor;

}
