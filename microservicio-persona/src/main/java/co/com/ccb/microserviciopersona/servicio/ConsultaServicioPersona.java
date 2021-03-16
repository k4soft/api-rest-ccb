package co.com.ccb.microserviciopersona.servicio;

import java.util.List;

import co.com.ccb.microserviciopersona.dto.PersonaDTO;
import co.com.ccb.microserviciopersona.model.Persona;

public interface ConsultaServicioPersona {
	


	List<PersonaDTO> findAll();

	List<PersonaDTO> findByActivo(boolean activo);
	
	List<PersonaDTO> findByNombre(String nombre);
	
	

}
