package co.com.ccb.apirest.aplicacion.impl;
import org.springframework.transaction.annotation.Transactional;


public interface ManejadorComando<C> {
	@Transactional
	void ejecutar(C comando);
}
