package co.com.ccb.apirest.servicio.persona.borrado.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.persistencia.PersonaRepository;
import co.com.ccb.apirest.servicio.persona.borrado.BorradoServicioPersona;


@Service
public class BorradoServicioPersonaImpl implements BorradoServicioPersona{
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Integer ejecutar(Persona persona) {
		personaRepository.delete(persona);
		return persona.getIdPersona();
	}

}
