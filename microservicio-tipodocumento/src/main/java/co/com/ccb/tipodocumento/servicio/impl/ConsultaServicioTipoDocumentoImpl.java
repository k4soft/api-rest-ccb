package co.com.ccb.tipodocumento.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ccb.tipodocumento.model.TipoDocumento;
import co.com.ccb.tipodocumento.repository.TipoDocumentoRepository;
import co.com.ccb.tipodocumento.servicio.ConsultaServicioTipoDocumento;


@Service
public class ConsultaServicioTipoDocumentoImpl implements ConsultaServicioTipoDocumento{
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public List<TipoDocumento> findAll() {
		return (List<TipoDocumento>)tipoDocumentoRepository.findAll();
	}

}
