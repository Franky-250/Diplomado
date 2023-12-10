package co.edu.iudigital.app.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "usuarios")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column (name = "username", nullable = false, unique = true, length = 120)
    String username;

    @Column (name = "nombre", nullable = false, length = 120)
    String nombre;

    @Column (name = "apellido", length = 120)
    String apellido;

    @Column
    String password;

    @Column (name = "fecha_nacimiento")
    LocalDate fechaNacimiento;

    @Column
    Boolean enable;

    @Column
    String imagen;

    @Column (name = "red_social")
    Boolean redSocial;

    @ManyToMany
            @JoinTable(
                    name = "roles_usuarios",
                    joinColumns = {
                            @JoinColumn(name = "usuarios_id")
                    },
                    inverseJoinColumns = {
                            @JoinColumn(name = "roles_id")
                    }
            )
    List<Role> roles;
}
