package mx.post.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import mx.post.modelo.PostDTO;
import mx.post.servicio.PostServicio;

@RestController
@RequestMapping("/post")
public class PostControlador {
	
	@Autowired
	private PostServicio postServicio;	
	

	@GetMapping("/") 
	public List<PostDTO> obtenerListaPost() {		
		return postServicio.obtenerListaPost();		  	
	}
	
	@GetMapping("/persona/{id}") 
	public List<PostDTO> obtenerListaPostPorIdPersona(
			@PathVariable("id") Integer id) {		
		return postServicio.obtenerListaPostPorIdPersona(id);		  	
	}
	
	@PostMapping("/") 
	public Boolean crearPost(
			@RequestBody  PostDTO post) {		
		return postServicio.crearPost(post);		  	
	}
	
 
}
