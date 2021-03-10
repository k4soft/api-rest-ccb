package co.com.ccb.apirest.persistencia;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.ccb.apirest.model.Persona;


//https://www.baeldung.com/spring-data-jpa-query

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

	Iterable<Persona> findByActivo(boolean activo);
	
	
	@Query( value = "SELECT * FROM PERSONA  WHERE nombre LIKE %:nombre%",   nativeQuery = true)
	Iterable<Persona> findByNombre(@Param("nombre") String nombre);
	
	
	

}
