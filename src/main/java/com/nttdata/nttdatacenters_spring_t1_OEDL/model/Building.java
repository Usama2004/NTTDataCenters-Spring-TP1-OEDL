package com.nttdata.nttdatacenters_spring_t1_OEDL.model;

//Clase que representa un edificio con nombre, dirección y número de pisos.
public class Building {
    private String name;
    private String address;
    private int floors;

    // Constructor
    public Building(String name, String address, int floors) {
        this.name = name;
        this.address = address;
        this.floors = floors;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}

