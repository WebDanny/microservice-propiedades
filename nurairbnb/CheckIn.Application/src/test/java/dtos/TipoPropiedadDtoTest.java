package dtos;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoPropiedadDtoTest {

  @Test
  public void testConstructorAndGetters() {
    UUID id = UUID.randomUUID();
    String nombreTipo = "Casa";

    TipoPropiedadDto tipoPropiedad = new TipoPropiedadDto(id, nombreTipo);

    assertEquals(id, tipoPropiedad.id);
    assertEquals(nombreTipo, tipoPropiedad.nombreTipo);
  }

  @Test
  public void testDefaultConstructor() {
    TipoPropiedadDto tipoPropiedad = new TipoPropiedadDto();

    assertEquals(null, tipoPropiedad.id);
    assertEquals(null, tipoPropiedad.nombreTipo);
  }
}
