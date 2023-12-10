package co.edu.iudigital.app.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "casos")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Caso implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column (name = "fecha_hora")
    LocalDateTime fechaHora;


    @Column (name = "latitud")
    Float latitud;

    @Column (name = "longitud")
    Float longitud;

    @Column (name = "altitud")
    Float altitud;

    @Column (name = "is_visible")
    Boolean isVisible;

    @Column (name = "detalle")
    String detalle;

    @Column (name = "utl_map")
    String utlMap;

    @Column (name = "rmi_url")
    String rmiUrl;

    @ManyToOne
    @JoinColumn(name = "delitos_id")
    Delito delito;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    Usuario usuario;
}
