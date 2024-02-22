package model;
import jakarta.persistence.*;
import jakarta.persistence.UniqueConstraint;

@Table(
        name = "movies", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_movie"})}
)

@Entity
public class movies {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id_movie;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "release_date", nullable = false)
    private Integer release_date;

    @Column(name = "desciption", nullable = false)
    private String desciption;

    @Column(name = "rating", nullable = false)
    private Double rating;

}
