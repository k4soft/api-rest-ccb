package co.com.ccb.microserviciopersona.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.ccb.microserviciopersona.model.Persona;


//https://www.baeldung.com/spring-data-jpa-query

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

	List<Persona> findByActivo(boolean activo);
	
	
	@Query( value = "SELECT * FROM PERSONA  WHERE nombre LIKE %:nombre%",   nativeQuery = true)
	List<Persona> findByNombre(@Param("nombre") String nombre);
	
	
	

}
