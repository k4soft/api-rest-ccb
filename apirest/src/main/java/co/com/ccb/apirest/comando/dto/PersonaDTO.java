package co.com.ccb.apirest.comando.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {
	private Integer idPersona;
	private Integer idTipoDocumento;
	private String numeroDocumento;
	private String nombre;
	private String apellido;
}
