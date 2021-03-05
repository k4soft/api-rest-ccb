package co.com.ccb.apirest.aplicacion.impl;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComandoRespuesta <C, R> {
	@Transactional
	R ejecutar(C comando);
}
