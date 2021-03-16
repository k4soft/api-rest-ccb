package co.com.ccb.microserviciopersona.repositorio;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import co.com.ccb.microserviciopersona.dto.TipoDocumentoDTO;

@FeignClient(name="servicio-tipo-documento", url ="http://localhost:8888/v1/tipo-documento")
public interface TipoDocumentoRepositoryRemoto {
	
	@GetMapping
	public List<TipoDocumentoDTO> findAll();

}
