package co.com.ccb.apirest.servicio.persona.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.persistencia.PersonaRepository;
import co.com.ccb.apirest.servicio.persona.creacion.CreacionServicioPersona;

@Service
public class CreacionServicioPersonaImpl implements CreacionServicioPersona {
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public void ejecutar(Persona persona) {
		personaRepository.save(persona);
	}

}
