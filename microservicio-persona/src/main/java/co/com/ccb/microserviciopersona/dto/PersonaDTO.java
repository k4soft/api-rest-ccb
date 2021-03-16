package co.com.ccb.microserviciopersona.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonaDTO {
	
	
	private Integer idPersona;

	private String numeroDocumento;
	
	private TipoDocumentoDTO tipoDocumento;
	
	private String nombre;

	private String apellido;

	private boolean activo;

}
