package co.com.ccb.apirest.comando.converter.persona;

import org.springframework.stereotype.Component;

import co.com.ccb.apirest.comando.dto.PersonaDTO;
import co.com.ccb.apirest.dominio.ValidadorArgumento;
import co.com.ccb.apirest.model.Persona;

@Component
public class PersonaConverter {

	private static final String EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO = "El tipo de documento es obligatorio";
	private static final String EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO = "El número  de documento es obligatorio";

	public Persona crear(PersonaDTO personaDTO) {
		ValidadorArgumento.validarObligatorio(personaDTO.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getNumeroDocumento(), EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO);
		Persona persona = new Persona();
		persona.getTipoDocumento().setIdTipoDocumento(personaDTO.getIdTipoDocumento());
		persona.setNumeroDocumento(personaDTO.getNumeroDocumento());
		persona.setNombre(personaDTO.getNombre());
		persona.setApellido(personaDTO.getApellido());
		return persona;
	}

}
