package co.com.ccb.apirest.servicio.persona.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.persistencia.PersonaRepository;
import co.com.ccb.apirest.servicio.persona.consulta.ConsultaServicioPersona;

@Service
public class ConsultaServicioPersonaImpl implements ConsultaServicioPersona {
	
	@Autowired
	private PersonaRepository repository;

	@Override
	public Iterable<Persona> findAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<Persona> findByActivo(boolean activo) {
		return repository.findByActivo(activo);
	}
	
	@Override
	public Iterable<Persona> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	

}
