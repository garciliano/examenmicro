package mx.post.servicio;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import mx.post.entidad.Post;
import mx.post.modelo.PostDTO;
import mx.post.repositorio.PostRepositorio;

@Service
public class PostServicio {

	@Autowired
	private PostRepositorio postRepositorio;

	public List<PostDTO> obtenerListaPost() {

		List<Post> posts = postRepositorio.findAll();
		List<PostDTO> respuesta = new ArrayList<>();

		for (Post po : posts) {
			PostDTO post = new PostDTO();
			post.setIdPost(po.getIdPost());
			post.setPost(po.getPost());
			post.setIdPersona(po.getIdPersona());
			post.setIdLibro(po.getIdLibro());
			post.setMeGusta(po.getMeGusta());
			post.setRegistroActivo(po.getRegistroActivo());
			post.setFechaAlta(po.getFechaAlta());
			post.setFechaModificacion(po.getFechaModificacion());
			respuesta.add(post);
		}

		return respuesta;
	}

	public List<PostDTO> obtenerListaPostPorIdPersona(Integer id) {

		List<Post> posts = postRepositorio.postPorIdPersona(id);
		List<PostDTO> respuesta = new ArrayList<>();

		for (Post po : posts) {
			PostDTO post = new PostDTO();
			post.setIdPost(po.getIdPost());
			post.setPost(po.getPost());
			post.setIdPersona(po.getIdPersona());
			post.setIdLibro(po.getIdLibro());
			post.setMeGusta(po.getMeGusta());
			post.setRegistroActivo(po.getRegistroActivo());
			post.setFechaAlta(po.getFechaAlta());
			post.setFechaModificacion(po.getFechaModificacion());
			respuesta.add(post);
		}

		return respuesta;

	}

	public Boolean crearPost(PostDTO post) {

		Post po = new Post(post.getPost(), post.getIdPersona(), post.getIdLibro(), post.getMeGusta(),
				(post.getRegistroActivo() != null ? post.getRegistroActivo() : true), post.getFechaAlta(),
				(post.getFechaModificacion() != null ? post.getFechaModificacion() : post.getFechaAlta()));

		try {
			postRepositorio.save(po);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}
 
	
	
	
	
	
}
