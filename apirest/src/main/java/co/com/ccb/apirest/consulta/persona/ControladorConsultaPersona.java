package co.com.ccb.apirest.consulta.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.servicio.persona.consulta.ConsultaServicioPersona;

@RestController
@RequestMapping("/v1/persona")
public class ControladorConsultaPersona {
	
	@Autowired
	private ConsultaServicioPersona consultaServicioPersona;
	
	@GetMapping
	Iterable<Persona> findAll(){
		return consultaServicioPersona.findAll();
	}

}
