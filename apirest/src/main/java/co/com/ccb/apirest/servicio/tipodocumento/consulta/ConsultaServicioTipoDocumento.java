package co.com.ccb.apirest.servicio.tipodocumento.consulta;

import co.com.ccb.apirest.model.TipoDocumento;

public interface ConsultaServicioTipoDocumento {

	 Iterable<TipoDocumento> findAll();

}
