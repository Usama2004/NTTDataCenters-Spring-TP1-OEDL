package com.nttdata.nttdatacenters_spring_t1_OEDL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nttdata.nttdatacenters_spring_t1_OEDL.model.Person;
import com.nttdata.nttdatacenters_spring_t1_OEDL.service.BuildingService;

//Marca esta clase como la principal para una aplicación Spring Boot.
@SpringBootApplication/*(scanBasePackages = {"com.nttdata.nttdatacenters_spring_t1_OEDL.service"})*/
/*
En caso de que no usemos la estructura estandar para que SpringBoot escanee automaticamente los paquetes
deberemos usar la anotacion scanBasePackages que va al lado de @SpringBootApplication para decirle a
SpringBoot especificamente en que paquete debe buscar el BuildingService.
*/

//Clase principal que inicia la aplicación y consume los servicios.
public class NttdatacentersSpringT1OedlApplication implements CommandLineRunner {
	//CommandLineRunner: Permite ejecutar código al inicio de la aplicación.
	//El método run de CommandLineRunner se ejecuta, permitiéndote realizar cualquier tarea de 
	//inicialización que necesites, como cargar datos iniciales, configurar parámetros, etc.
	
	//Inyecta una instancia de BuildingService
    @Autowired
    private BuildingService buildingService;

    public static void main(String[] args) {
    	//Método que se ejecuta al inicio. Añade personas, lista todas las personas y busca una persona específica
        SpringApplication.run(NttdatacentersSpringT1OedlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        buildingService.addPerson(new Person("John", "Doe"));
        buildingService.addPerson(new Person("Jane", "Smith"));

        System.out.println("All people:");
        buildingService.getAllPeople().forEach(person -> 
            System.out.println(person.getFirstName() + " " + person.getLastName())
        );

        System.out.println("Find person:");
        Person person = buildingService.findPerson("John", "Doe");
        if (person != null) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println("Person not found");
        }
    }
}
