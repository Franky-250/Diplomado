package co.edu.iudigital.app.dtos;

import co.edu.iudigital.app.models.Delito;
import co.edu.iudigital.app.models.Usuario;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CasoDTO {

    Long id;

    LocalDateTime fechaHora;

    Float latitud;

    Float longitud;

    Float altitud;

    Boolean isVisible;

    String detalle;

    String utlMap;

    String rmiUrl;

}
