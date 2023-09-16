package ar.docker.compose.controller;

import ar.docker.compose.dao.PersonRepository;
import ar.docker.compose.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Period;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PersonController {

    PersonRepository personRepository;

    @GetMapping("/users")
    public List<Person> getUsers() {
        return this.personRepository.findAll();
    }

}
