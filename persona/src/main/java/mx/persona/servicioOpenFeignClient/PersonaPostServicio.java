package mx.persona.servicioOpenFeignClient;
 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.persona.modelo.PostDTO;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.cloud.openfeign.FeignClient;



@FeignClient(
		name = "post", 
		url = "http://localhost:8083",
		fallback=PersonaClientFallBack.class)
public interface PersonaPostServicio {
	@RequestMapping(method = POST, value = "post/", produces = "application/json")
	Boolean crearPost(@RequestBody PostDTO post);

}
