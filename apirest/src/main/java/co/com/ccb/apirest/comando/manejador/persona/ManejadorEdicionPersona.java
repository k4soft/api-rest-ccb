package co.com.ccb.apirest.comando.manejador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ccb.apirest.aplicacion.ComandoRespuesta;
import co.com.ccb.apirest.aplicacion.impl.ManejadorComandoRespuesta;
import co.com.ccb.apirest.comando.converter.persona.PersonaConverter;
import co.com.ccb.apirest.comando.dto.PersonaDTO;
import co.com.ccb.apirest.servicio.persona.edicion.EdicionServicioPersona;

@Component
public class ManejadorEdicionPersona implements ManejadorComandoRespuesta<PersonaDTO, ComandoRespuesta<Integer>>{
	
	@Autowired
	private EdicionServicioPersona edicionServicioPersona;
	
	@Autowired
	private PersonaConverter personaConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(PersonaDTO personaDTO) {	
		return new ComandoRespuesta<Integer>(edicionServicioPersona.ejecutar(personaConverter.editar(personaDTO)));
	}

	

}
