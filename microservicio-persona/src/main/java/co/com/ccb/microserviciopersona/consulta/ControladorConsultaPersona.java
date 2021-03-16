package co.com.ccb.microserviciopersona.consulta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.microserviciopersona.dto.PersonaDTO;
import co.com.ccb.microserviciopersona.servicio.ConsultaServicioPersona;

@RestController
@RequestMapping("/v1/persona")
public class ControladorConsultaPersona {
	
	@Autowired
	private ConsultaServicioPersona consultaServicioPersona;
	
	@GetMapping
	List<PersonaDTO> findAll(){
		return consultaServicioPersona.findAll();
	}
	
	
    
	@GetMapping("/segun-activo/{activo}")
	List<PersonaDTO> findByActivo(@PathVariable boolean activo){
		return consultaServicioPersona.findByActivo(activo);
	}
	
   
	@GetMapping("/segun-nombre/{nombre}")
	List<PersonaDTO> findByNombre(@PathVariable String nombre){
		return consultaServicioPersona.findByNombre(nombre);
	}
	


}
