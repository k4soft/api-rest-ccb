package co.com.ccb.apirest.comando.controlador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.apirest.model.Persona;
import co.com.ccb.apirest.servicio.persona.creacion.CreacionServicioPersona;

@RestController
@RequestMapping("/v1/persona")
public class ComandoControladorPersona {

	@Autowired
	private CreacionServicioPersona creacionServicioPersona;

	@PostMapping
	public void crear(@RequestBody Persona persona) {
		creacionServicioPersona.ejecutar(persona);
	}

}
