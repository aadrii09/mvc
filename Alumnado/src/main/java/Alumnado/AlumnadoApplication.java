package Alumnado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("Repositories")
@EntityScan("Entities")
@ComponentScan("ServiceImpl")
@ComponentScan("Controller")
public class AlumnadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumnadoApplication.class, args);
	}

}
