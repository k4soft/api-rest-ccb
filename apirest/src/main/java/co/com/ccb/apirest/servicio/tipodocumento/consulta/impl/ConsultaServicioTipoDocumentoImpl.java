package co.com.ccb.apirest.servicio.tipodocumento.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.apirest.model.TipoDocumento;
import co.com.ccb.apirest.persistencia.TipoDocumentoRepository;
import co.com.ccb.apirest.servicio.tipodocumento.consulta.ConsultaServicioTipoDocumento;


@Service
public class ConsultaServicioTipoDocumentoImpl implements ConsultaServicioTipoDocumento{
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public Iterable<TipoDocumento> findAll() {
		return tipoDocumentoRepository.findAll();
	}

}
