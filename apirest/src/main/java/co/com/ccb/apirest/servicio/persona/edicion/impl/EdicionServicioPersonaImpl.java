package co.com.ccb.apirest.servicio.persona.edicion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.persistencia.PersonaRepository;
import co.com.ccb.apirest.servicio.persona.edicion.EdicionServicioPersona;


@Service
public class EdicionServicioPersonaImpl implements EdicionServicioPersona{
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Integer ejecutar(Persona persona) {
		personaRepository.save(persona);
		return persona.getIdPersona();
	}

}
