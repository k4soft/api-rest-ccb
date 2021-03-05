package co.com.ccb.apirest.servicio.persona.creacion;

import co.com.ccb.apirest.model.Persona;

public interface CreacionServicioPersona {

	/**
	 * Inserta una persona
	 * @param persona
	 * @return idPersona
	 */
	Integer ejecutar(Persona persona);

}
