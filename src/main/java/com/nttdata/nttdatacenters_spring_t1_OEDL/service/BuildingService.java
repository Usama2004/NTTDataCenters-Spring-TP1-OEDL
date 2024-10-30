package com.nttdata.nttdatacenters_spring_t1_OEDL.service;

import org.springframework.stereotype.Service;
import com.nttdata.nttdatacenters_spring_t1_OEDL.model.Person;
import java.util.ArrayList;
import java.util.List;

//Marca esta clase como un servicio de Spring
@Service
//Servicio que maneja la lógica de negocio relacionada con las personas en el edificio.
public class BuildingService {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getAllPeople() {
        return people;
    }

    public Person findPerson(String firstName, String lastName) {
        return people.stream()
                .filter(p -> p.getFirstName().equals(firstName) && p.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }
}

