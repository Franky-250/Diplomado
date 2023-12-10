package co.edu.iudigital.app.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "roles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column (name = "nombre", nullable = false, unique = true, length = 120)
    String nombre;

    @Column (name = "descripcion", length = 120)
    String descripción;

}

