package co.com.ccb.apirest.consulta.tipodocumento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.apirest.model.TipoDocumento;
import co.com.ccb.apirest.servicio.tipodocumento.consulta.ConsultaServicioTipoDocumento;

@RestController
@RequestMapping("/v1/tipo-documento")
public class ContraladorConsultaTipoDocumento {
	
	
	@Autowired
	private ConsultaServicioTipoDocumento consultaServicioTipoDocumento;
	
	
	 @Secured({"ROLE_CONSULTA"})
	@GetMapping
	public Iterable<TipoDocumento> findAll(){
		return consultaServicioTipoDocumento.findAll();
	}

}
