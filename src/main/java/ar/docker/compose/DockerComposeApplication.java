package ar.docker.compose;

import ar.docker.compose.dao.PersonRepository;
import ar.docker.compose.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerComposeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerComposeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> personRepository.save(new Person(1, "Docker", "Compose", "DC Tutorial"));
    }
}
