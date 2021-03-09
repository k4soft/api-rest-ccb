package co.com.ccb.apirest.comando.manejador.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ccb.apirest.aplicacion.ComandoRespuesta;
import co.com.ccb.apirest.aplicacion.impl.ManejadorComandoRespuesta;
import co.com.ccb.apirest.comando.converter.persona.PersonaConverter;
import co.com.ccb.apirest.servicio.persona.borrado.BorradoServicioPersona;

@Component
public class ManejadorBorradoPersona implements ManejadorComandoRespuesta<Integer, ComandoRespuesta<Integer>> {

	@Autowired
	private BorradoServicioPersona borradoServicioPersona;

	@Autowired
	private PersonaConverter personaConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(Integer idPersona) {
		return new ComandoRespuesta<Integer>(borradoServicioPersona.ejecutar(personaConverter.borrar(idPersona)));
	}

}
