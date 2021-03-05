package co.com.ccb.apirest.comando.controlador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.apirest.aplicacion.ComandoRespuesta;
import co.com.ccb.apirest.comando.dto.PersonaDTO;
import co.com.ccb.apirest.comando.manejador.persona.ManejadorCreacionPersona;

@RestController
@RequestMapping("/v1/persona")
public class ComandoControladorPersona {

	@Autowired
	private ManejadorCreacionPersona manejadorCreacionPersona;

	@PostMapping
	public ComandoRespuesta<Integer> crear(@RequestBody PersonaDTO persona) {
		return manejadorCreacionPersona.ejecutar(persona);
	}

}
