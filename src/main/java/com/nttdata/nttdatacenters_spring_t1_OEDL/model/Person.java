package com.nttdata.nttdatacenters_spring_t1_OEDL.model;

//Clase que representa una persona con nombre y apellidos.
public class Person {
    private String firstName;
    private String lastName;

    // Constructor, getters y setters
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

