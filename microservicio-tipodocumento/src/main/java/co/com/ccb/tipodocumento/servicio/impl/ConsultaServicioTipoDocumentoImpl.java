package co.com.ccb.tipodocumento.servicio.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import co.com.ccb.tipodocumento.model.TipoDocumento;
import co.com.ccb.tipodocumento.repository.TipoDocumentoRepository;
import co.com.ccb.tipodocumento.servicio.ConsultaServicioTipoDocumento;


@Service
public class ConsultaServicioTipoDocumentoImpl implements ConsultaServicioTipoDocumento{
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;
	
	@Value("${server.port}")
	private Integer port;

	@Override
	public List<TipoDocumento> findAll() {
		List<TipoDocumento>  listaTipoDocumento = (List<TipoDocumento>)tipoDocumentoRepository.findAll();
		return listaTipoDocumento.stream().map(p -> {
			p.setPort(port);
			return p;
		}).collect(Collectors.toList());
	}

}
