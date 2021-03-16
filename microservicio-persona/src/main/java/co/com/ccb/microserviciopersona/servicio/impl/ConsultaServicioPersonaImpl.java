package co.com.ccb.microserviciopersona.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.microserviciopersona.converter.PersonaConverter;
import co.com.ccb.microserviciopersona.dto.PersonaDTO;
import co.com.ccb.microserviciopersona.dto.TipoDocumentoDTO;
import co.com.ccb.microserviciopersona.model.Persona;
import co.com.ccb.microserviciopersona.repositorio.PersonaRepository;
import co.com.ccb.microserviciopersona.repositorio.TipoDocumentoRepositoryRemoto;
import co.com.ccb.microserviciopersona.servicio.ConsultaServicioPersona;

@Service
public class ConsultaServicioPersonaImpl implements ConsultaServicioPersona {

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private TipoDocumentoRepositoryRemoto tipoDocumentoRepository;
	
	@Autowired
	private PersonaConverter personaConverter;

	@Override
	public List<PersonaDTO> findAll() {

		List<Persona> personas = (List<Persona>) personaRepository.findAll();
		List<TipoDocumentoDTO> listaTipoDocumentos = tipoDocumentoRepository.findAll();
		return personaConverter.toDTO(personas,listaTipoDocumentos);
	}

	@Override
	public List<PersonaDTO> findByActivo(boolean activo) {
		List<Persona> personas =  (List<Persona>) personaRepository.findByActivo(activo);
		List<TipoDocumentoDTO> listaTipoDocumentos = tipoDocumentoRepository.findAll();
		return personaConverter.toDTO(personas,listaTipoDocumentos);
	}

	@Override
	public List<PersonaDTO> findByNombre(String nombre) {
		List<Persona> personas = (List<Persona>) personaRepository.findByNombre(nombre);
		List<TipoDocumentoDTO> listaTipoDocumentos = tipoDocumentoRepository.findAll();
		return personaConverter.toDTO(personas,listaTipoDocumentos);
	}

}
