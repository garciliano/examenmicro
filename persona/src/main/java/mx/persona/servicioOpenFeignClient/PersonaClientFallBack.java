package mx.persona.servicioOpenFeignClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import mx.persona.modelo.PostDTO;


@Component
public class PersonaClientFallBack implements PersonaPostServicio  {
 
	 private static final Logger log = LogManager.getLogger(PersonaClientFallBack.class);
	 
	@Override
	public Boolean crearPost(PostDTO post) {
		log.info("Error controlado, servicio de post no disponible, evitando TIMEOUT");
		return false;
	}
}
