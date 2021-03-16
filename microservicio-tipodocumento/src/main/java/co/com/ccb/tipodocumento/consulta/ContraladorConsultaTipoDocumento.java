package co.com.ccb.tipodocumento.consulta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ccb.tipodocumento.model.TipoDocumento;
import co.com.ccb.tipodocumento.servicio.ConsultaServicioTipoDocumento;

@RestController
@RequestMapping("/v1/tipo-documento")
public class ContraladorConsultaTipoDocumento {
	
	
	@Autowired
	private ConsultaServicioTipoDocumento consultaServicioTipoDocumento;
	
	
	@GetMapping
	public List<TipoDocumento> findAll(){
		return consultaServicioTipoDocumento.findAll();
	}

}
