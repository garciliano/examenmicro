package mx.persona.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.persona.modelo.PersonaDTO;
import mx.persona.servicio.PersonaServicio;
import mx.persona.modelo.PostDTO;

@RestController
@RequestMapping("/persona")
public class PersonaControlador { 

	@Autowired
	private PersonaServicio personaServicio;	
 
	@GetMapping("/") 
	public List<PersonaDTO> obtenerListaPersonas() {		
		return personaServicio.obtenerListaPersonas();		  	
	}
	
	
	@GetMapping("/nombre/{nombre}") 
	public List<PersonaDTO> obtenerListaPersonasPorNombre(
			@PathVariable("nombre") String nombre) {		
		return personaServicio.obtenerListaPersonasPorNombre(nombre);		  	
	}
	
	@GetMapping("/correo/{correo}") 
	public List<PersonaDTO> obtenerListaPersonasPorCorreo(
			@PathVariable("correo") String correo) {		
		return personaServicio.obtenerListaPersonasPorCorreo(correo);		  	
	}
	
	
	@GetMapping("/alias/{alias}") 
	public List<PersonaDTO> obtenerListaPersonasPorAlias(
			@PathVariable("alias") String alias) {		
		return personaServicio.obtenerListaPersonasPorAlias(alias);		  	
	}
	
	@GetMapping("/alias/validacion/{alias}") 
	public Boolean validarExisteAlias(
			@PathVariable("alias") String alias) {		
		return personaServicio.validarExisteAlias(alias);		  	
	}
	
	
	@PostMapping("/") 
	public Boolean crearPersona(
			@RequestBody  PersonaDTO persona) {		
		return personaServicio.crearPersona(persona);		  	
	}
	
	@PutMapping("/") 
	public Boolean actualizarStatusPersona(
			@RequestBody  PersonaDTO persona) {		
		return personaServicio.actualizarStatusPersona(persona);		  	
	}
	

	@PostMapping("/post/") 
	public Boolean crearPost(
			@RequestBody  PostDTO post) {		
		return personaServicio.crearPost(post);		  	
	}
	
	
	
	
	
}
