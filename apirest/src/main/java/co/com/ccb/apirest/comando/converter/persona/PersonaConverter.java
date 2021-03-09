package co.com.ccb.apirest.comando.converter.persona;

import org.springframework.stereotype.Component;

import co.com.ccb.apirest.comando.dto.PersonaDTO;
import co.com.ccb.apirest.dominio.ValidadorArgumento;
import co.com.ccb.apirest.model.Persona;

@Component
public class PersonaConverter {

	private static final String EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO = "El tipo de documento es obligatorio";
	private static final String EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO = "El número  de documento es obligatorio";
	private static final String EL_NOMBRE_PERSONA_ES_OBLIGATORIO = "El nombre es obligatorio";
	private static final String EL_APELLIDO_PERSONA_ES_OBLIGATORIO = "El apellido es oblugatorio";
	private static final String EL_ID_NO_ES_VALIDO ="El id de la persona no es vàlido";

	public Persona crear(PersonaDTO personaDTO) {
		ValidadorArgumento.validarObligatorio(personaDTO.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getNumeroDocumento(), EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getNombre(), EL_NOMBRE_PERSONA_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getApellido(), EL_APELLIDO_PERSONA_ES_OBLIGATORIO);
		Persona persona = new Persona();
		persona.getTipoDocumento().setIdTipoDocumento(personaDTO.getIdTipoDocumento());
		persona.setNumeroDocumento(personaDTO.getNumeroDocumento());
		persona.setNombre(personaDTO.getNombre());
		persona.setApellido(personaDTO.getApellido());
		persona.setActivo(true);
		return persona;
	}
	

	public Persona editar(PersonaDTO personaDTO) {
		ValidadorArgumento.validarPositivo(personaDTO.getIdPersona(), EL_ID_NO_ES_VALIDO);
		ValidadorArgumento.validarObligatorio(personaDTO.getIdTipoDocumento(), EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getNumeroDocumento(), EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getNombre(), EL_NOMBRE_PERSONA_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(personaDTO.getApellido(), EL_APELLIDO_PERSONA_ES_OBLIGATORIO);
		Persona persona = new Persona();
		persona.setIdPersona(personaDTO.getIdPersona());
		persona.getTipoDocumento().setIdTipoDocumento(personaDTO.getIdTipoDocumento());
		persona.setNumeroDocumento(personaDTO.getNumeroDocumento());
		persona.setNombre(personaDTO.getNombre());
		persona.setApellido(personaDTO.getApellido());
		persona.setActivo(personaDTO.isActivo());
		return persona;
		
	}

	public Persona borrar(Integer idPersona) {
		ValidadorArgumento.validarPositivo(idPersona, EL_ID_NO_ES_VALIDO);
		Persona persona = new Persona();
		persona.setIdPersona(idPersona);
		return persona;
	}

	
	
	
	

}
