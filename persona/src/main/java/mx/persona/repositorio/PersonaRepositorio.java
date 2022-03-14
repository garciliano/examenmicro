package mx.persona.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.persona.entidad.Persona;

@Repository
public interface PersonaRepositorio  extends JpaRepository<Persona, Integer> {
	 
	
	
	@Query("select p from Persona p "
			+ "where concat(p.nombre, ' ', p.apellido_paterno, ' ', p.apellido_materno)like %:nombre% ") 
	List<Persona> personasPorNombre(@Param("nombre")  String nombre);
	 
	
	@Query("select p from Persona p "
			+ "where p.correo like %:correo% ") 
	List<Persona> obtenerListaPersonasPorCorreo(@Param("correo")  String correo);
	
	 
	
	@Query("select p from Persona p "
			+ "where p.alias like %:alias% ") 
	List<Persona> obtenerListaPersonasPorAlias(@Param("alias")  String alias);
	
	@Query("select p from Persona p "
			+ "where p.alias =:alias ") 
	Optional<Persona> validarAlias(@Param("alias")  String alias);
	
	
}
