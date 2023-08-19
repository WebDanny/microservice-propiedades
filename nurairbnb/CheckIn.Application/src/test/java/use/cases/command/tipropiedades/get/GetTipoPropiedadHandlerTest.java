package use.cases.command.tipropiedades.get;

import an.awesome.pipelinr.Command;
import core.BusinessRuleValidationException;
import dtos.TipoPropiedadDto;
import model.TipoPropiedad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;
import repositories.TipoPropiedadRepository;
import utils.TipoPropiedadMapper;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetTipoPropiedadHandlerTest {

  private TipoPropiedadRepository tipoPropiedadRepository;
  private GetTipoPropiedadHandler getTipoPropiedadHandler;

  @BeforeEach
  public void setUp() {
    tipoPropiedadRepository = mock(TipoPropiedadRepository.class);
    getTipoPropiedadHandler = new GetTipoPropiedadHandler(tipoPropiedadRepository);
  }

  @Test
  public void testHandle() throws BusinessRuleValidationException {
    UUID mockId = UUID.randomUUID();
    List<TipoPropiedad> mockPropiedades = Arrays.asList(
            new TipoPropiedad()

    );
    GetTipoPropiedadQuery query = new GetTipoPropiedadQuery(mockId.toString());
    when(tipoPropiedadRepository.findTipoPropiedadById(mockId)).thenReturn(mockPropiedades);

    List<TipoPropiedadDto> result = getTipoPropiedadHandler.handle(query);

    assertNotNull(result);
    assertEquals(mockPropiedades.size(), result.size());
  }
}
