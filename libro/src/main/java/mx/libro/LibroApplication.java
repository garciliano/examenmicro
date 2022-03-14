package mx.libro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LibroApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibroApplication.class, args);
	}

}
