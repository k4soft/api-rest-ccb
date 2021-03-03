package co.com.ccb.apirest.consulta.tipodocumento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/documento-identidad")
@RestController
public class ConsultaControladorDocumentoIdentidad {
	
	@GetMapping("/status")
	public String showHealth() {
		return "It works!!!!";
	}
	
	

}
