package co.com.ccb.apirest.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.ccb.apirest.model.seguridad.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	
	Usuario findByNombreUsuario(String nombreUsuario);

}
