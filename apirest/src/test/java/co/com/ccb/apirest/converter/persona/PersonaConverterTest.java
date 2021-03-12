package co.com.ccb.apirest.converter.persona;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.com.ccb.apirest.baseprueba.BasePrueba;
import co.com.ccb.apirest.comando.converter.persona.PersonaConverter;
import co.com.ccb.apirest.comando.dto.PersonaDTO;
import co.com.ccb.apirest.dominio.excepcion.ExcepcionValorObligatorio;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaConverterTest {
	
	private static final String NUMERO_DOCUMENTO = "15425447";
	private static final int ID_DOCUMENTO_CEDULA = 1;

	private static final String EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO = "El tipo de documento es obligatorio";
	private static final String EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO = "El número  de documento es obligatorio";
	private static final String EL_NOMBRE_PERSONA_ES_OBLIGATORIO = "El nombre es obligatorio";
	
	
	@Autowired
	private PersonaConverter personaConverter;
	
	@Test
	public void crearFallaTipoDocumentoObligatorio() {
		PersonaDTO personaDTO = new PersonaDTO();
		BasePrueba.assertThrows(()-> personaConverter.crear(personaDTO),ExcepcionValorObligatorio.class, EL_TIPO_DE_DOCUMENTO_ES_OBLIGATORIO);	
	}
	
	
	@Test
	public void crearFallaNumeroDocumentoObligatorio() {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setIdTipoDocumento(ID_DOCUMENTO_CEDULA);
		BasePrueba.assertThrows(()-> personaConverter.crear(personaDTO),ExcepcionValorObligatorio.class, EL_NUMERO_DE_DOCUMENTO_ES_OBLIGATORIO);
	}
	
	@Test
	public void crearFallaNombreObligatorio() {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setIdTipoDocumento(ID_DOCUMENTO_CEDULA);
		personaDTO.setNumeroDocumento(NUMERO_DOCUMENTO);
		BasePrueba.assertThrows(()-> personaConverter.crear(personaDTO),ExcepcionValorObligatorio.class, EL_NOMBRE_PERSONA_ES_OBLIGATORIO);
	}

}
