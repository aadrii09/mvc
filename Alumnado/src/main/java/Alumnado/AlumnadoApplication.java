package Alumnado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("Repositories")
@EntityScan("Entities")
public class AlumnadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlumnadoApplication.class, args);
	}

}
