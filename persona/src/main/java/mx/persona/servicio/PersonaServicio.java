package mx.persona.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.persona.entidad.Persona;
import mx.persona.modelo.PersonaDTO;
import mx.persona.repositorio.PersonaRepositorio;
import mx.persona.servicioOpenFeignClient.PersonaPostServicio;
import mx.persona.modelo.PostDTO;



@Service
public class PersonaServicio {

	@Autowired
	private PersonaRepositorio personaRepositorio; 

	@Autowired
	private PersonaPostServicio personaPostServicio;

	public List<PersonaDTO> obtenerListaPersonas() {

		List<Persona> personas = personaRepositorio.findAll();
		List<PersonaDTO> respuesta = new ArrayList<>();

		for (Persona per : personas) {
			PersonaDTO persona = new PersonaDTO();
			persona.setIdPersona(per.getIdPersona());
			persona.setNombre(per.getNombre());
			persona.setCorreo(per.getCorreo());

			respuesta.add(persona);
		}

		return respuesta;

	}

	public List<PersonaDTO> obtenerListaPersonasPorNombre(String nombre) {

		List<Persona> personas = personaRepositorio.personasPorNombre(nombre);
		List<PersonaDTO> respuesta = new ArrayList<>();

		for (Persona per : personas) {
			PersonaDTO persona = new PersonaDTO();
			persona.setIdPersona(per.getIdPersona());
			persona.setNombre(per.getNombre());
			persona.setCorreo(per.getCorreo());

			respuesta.add(persona);
		}

		return respuesta;

	}

	public List<PersonaDTO> obtenerListaPersonasPorCorreo(String correo) {

		List<Persona> personas = personaRepositorio.obtenerListaPersonasPorCorreo(correo);
		List<PersonaDTO> respuesta = new ArrayList<>();

		for (Persona per : personas) {
			PersonaDTO persona = new PersonaDTO();
			persona.setIdPersona(per.getIdPersona());
			persona.setNombre(per.getNombre());
			persona.setCorreo(per.getCorreo());

			respuesta.add(persona);
		}

		return respuesta;

	}

	public List<PersonaDTO> obtenerListaPersonasPorAlias(String alias) {

		List<Persona> personas = personaRepositorio.obtenerListaPersonasPorAlias(alias);
		List<PersonaDTO> respuesta = new ArrayList<>();

		for (Persona per : personas) {
			PersonaDTO persona = new PersonaDTO();
			persona.setIdPersona(per.getIdPersona());
			persona.setNombre(per.getNombre());
			persona.setCorreo(per.getCorreo());

			respuesta.add(persona);
		}

		return respuesta;

	}

	public Boolean validarExisteAlias(String alias) {

		Optional<Persona> aliasExiste = personaRepositorio.validarAlias(alias);
		if (aliasExiste.isPresent()) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean crearPersona(PersonaDTO persona) {

		Persona per = new Persona(persona.getCorreo(), persona.getNombre(), persona.getApellidoPaterno(),
				persona.getApellidoMaterno(), persona.getFechaNacimiento(), persona.getContrasena(), persona.getAlias(),
				(persona.getRegistroactivo() != null ? persona.getRegistroactivo() : true), persona.getFechaAlta(),
				(persona.getFechaModificacion() != null ? persona.getFechaModificacion() : persona.getFechaAlta()),
				persona.getIdPersonAlta(),
				(persona.getIdPersonaModificacion() != null ? persona.getIdPersonaModificacion()
						: persona.getIdPersonAlta()));

		try {
			personaRepositorio.save(per);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

	public Boolean actualizarStatusPersona(PersonaDTO persona) {

		Optional<Persona> per = personaRepositorio.findById(persona.getIdPersona());
		if (per.isPresent()) {

			Persona personaActualizar = per.get();

			personaActualizar.setRegistroactivo(persona.getRegistroactivo());

			try {
				personaRepositorio.save(personaActualizar);
				return true;
			} catch (Exception e) {
				System.out.println(e);
				return false;
			}

		} else {
			return false;

		}
	}
	
	
	//
	

	public Boolean crearPost(PostDTO post) {
		Boolean resumenConfirmacion = personaPostServicio.crearPost(post);
		return resumenConfirmacion;
	}
 
	
	
	
	

}
