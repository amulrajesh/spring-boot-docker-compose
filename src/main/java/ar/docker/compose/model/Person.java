package ar.docker.compose.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor@NoArgsConstructor
public class Person implements Serializable {
    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String description;
}
