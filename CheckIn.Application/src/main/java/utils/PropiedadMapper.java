package utils;

import dtos.PropiedadDto;
import com.nur.model.Propiedad;

import java.util.UUID;

public class PropiedadMapper {

    public static PropiedadDto from(Propiedad propiedad) {
        if (propiedad == null) return new PropiedadDto();
        return new PropiedadDto(
                propiedad.getId(),
                propiedad.getNombre() == null ? "" : propiedad.getNombre(),
                propiedad.getEstado() == null ? "" : propiedad.getEstado().toString(),
                propiedad.getPrecio() == 0.0 ? 0.0 : propiedad.getPrecio()
        );
    }
}