package co.com.ccb.apirest.servicio.persona.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.apirest.dominio.excepcion.ExcepcionNoExisteRegistro;
import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.model.TipoDocumento;
import co.com.ccb.apirest.persistencia.PersonaRepository;
import co.com.ccb.apirest.persistencia.TipoDocumentoRepository;
import co.com.ccb.apirest.servicio.persona.creacion.CreacionServicioPersona;

@Service
public class CreacionServicioPersonaImpl implements CreacionServicioPersona {
	
	private static final String NO_EXISTE_DOCUMENTO_DE_IDENTIDAD = "No existe documento de identidad";

	@Autowired
	private PersonaRepository personaRepository;
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public Integer ejecutar(Persona persona) {
		TipoDocumento tipoDocumento = buscarTipoDocumento(persona);
		persona.setTipoDocumento(tipoDocumento);
		personaRepository.save(persona);
		return persona.getIdPersona();
	}

	private TipoDocumento buscarTipoDocumento(Persona persona) {
		TipoDocumento tipoDocumento = tipoDocumentoRepository.findById(persona.getTipoDocumento().getIdTipoDocumento()).orElse(null);
		if(tipoDocumento == null) {
			throw new ExcepcionNoExisteRegistro(NO_EXISTE_DOCUMENTO_DE_IDENTIDAD);
		}
		return tipoDocumento;
	}

}
