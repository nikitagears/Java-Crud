package model;
import jakarta.persistence.*;
import jakarta.persistence.UniqueConstraint;

@Table(
        name = "actors", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_actor"})}
)

@Entity
public class actors {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id_actor;

    @Column(name = "actor_name", nullable = false)
    private String actor_name;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "birthday", nullable = false)
    private String birthday;                      //какой формат для даты?

}
