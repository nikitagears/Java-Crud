package model;
import jakarta.persistence.*;
import jakarta.persistence.UniqueConstraint;

@Table(
        name = "genres", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_genre"})}
)

@Entity
public class genres {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id_genre;

    @Column(name = "genre", nullable = false)
    private String genre;

}
