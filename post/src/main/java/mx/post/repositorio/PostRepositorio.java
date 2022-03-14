package mx.post.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.post.entidad.Post;
 

@Repository
public interface PostRepositorio  extends JpaRepository<Post, Integer> {
	
	@Query("select p from Post p "
			+ "where p.idPersona =:id ") 
	List<Post> postPorIdPersona(@Param("id")  Integer id);
	 
	
	

}
