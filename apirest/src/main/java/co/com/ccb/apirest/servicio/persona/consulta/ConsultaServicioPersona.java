package co.com.ccb.apirest.servicio.persona.consulta;

import co.com.ccb.apirest.model.Persona;

public interface ConsultaServicioPersona {
	


	Iterable<Persona> findAll();

	Iterable<Persona> findByActivo(boolean activo);
	
	Iterable<Persona> findByNombre(String nombre);

	Persona findById(Integer idPersona);
	
	

}
