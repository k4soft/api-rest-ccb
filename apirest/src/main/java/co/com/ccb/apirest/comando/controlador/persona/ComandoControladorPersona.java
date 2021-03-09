package co.com.ccb.apirest.comando.controlador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.apirest.aplicacion.ComandoRespuesta;
import co.com.ccb.apirest.comando.dto.PersonaDTO;
import co.com.ccb.apirest.comando.manejador.persona.ManejadorBorradoPersona;
import co.com.ccb.apirest.comando.manejador.persona.ManejadorCreacionPersona;
import co.com.ccb.apirest.comando.manejador.persona.ManejadorEdicionPersona;

@RestController
@RequestMapping("/v1/persona")
public class ComandoControladorPersona {

	@Autowired
	private ManejadorCreacionPersona manejadorCreacionPersona;
	
	@Autowired
	private ManejadorEdicionPersona manejadorEdicionPersona;
	
	@Autowired
	private ManejadorBorradoPersona manejadorBorradoPersona;


	@PostMapping
	public ComandoRespuesta<Integer> crear(@RequestBody PersonaDTO persona) {
		return manejadorCreacionPersona.ejecutar(persona);
	}
	
	@PutMapping("/{idPersona}")
	public ComandoRespuesta<Integer> actualizar(@PathVariable Integer idPersona,@RequestBody PersonaDTO persona) {
		persona.setIdPersona(idPersona);
		return manejadorEdicionPersona.ejecutar(persona);
	}
	
	@DeleteMapping("/{idPersona}")
	public ComandoRespuesta<Integer> eliminar(@PathVariable Integer idPersona) {
		return manejadorBorradoPersona.ejecutar(idPersona);
	}
	
	

}
