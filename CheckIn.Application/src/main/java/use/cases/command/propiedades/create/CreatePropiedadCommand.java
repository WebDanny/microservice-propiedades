package use.cases.command.propiedades.create;

import an.awesome.pipelinr.Command;
import dtos.PropiedadDto;

public class CreatePropiedadCommand implements Command<PropiedadDto> {

  PropiedadDto propiedadDto;

  public CreatePropiedadCommand(PropiedadDto propiedadDto) {
    this.propiedadDto = propiedadDto;
  }
}
