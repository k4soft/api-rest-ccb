package co.com.ccb.microserviciopersona.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.com.ccb.microserviciopersona.dto.PersonaDTO;
import co.com.ccb.microserviciopersona.dto.TipoDocumentoDTO;
import co.com.ccb.microserviciopersona.model.Persona;

@Component
public class PersonaConverter {
	
	public List<PersonaDTO> toDTO(List<Persona> personas, List<TipoDocumentoDTO> listaTipoDocumentos){
		List<PersonaDTO> listaPersonasDTO = new ArrayList<>(personas.size());
		personas.forEach( p-> {
			TipoDocumentoDTO tipoDocumento = listaTipoDocumentos.stream().filter(td -> td.getIdTipoDocumento().intValue() == p.getIdTipoDocumento().intValue()).findFirst().get();
			listaPersonasDTO.add(new PersonaDTO(p.getIdPersona(), p.getNumeroDocumento(), tipoDocumento, p.getNombre(), p.getApellido(), p.isActivo()));
		});
		return listaPersonasDTO;
	}

}
