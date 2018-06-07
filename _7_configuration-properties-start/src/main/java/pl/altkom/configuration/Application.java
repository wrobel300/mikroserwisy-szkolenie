package pl.altkom.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// TODO 1 dodaj 3 propertisy do application.properties:test.property.foo, test.property.bar, test.property.x
// TODO 2 utwórz pakiet controller i w nim kontroler MainController
// TODO 3 w MainController utwórz 3 pola dla propertisów - wartość ustawiana za pomocą @ConfigurationProperties
// TODO 4 w MainController utwórz 3 osobne metody, które będą zwracały poszczególne wartości pól klasy
// TODO 5 napisz testy kontrolera dla jego 3 metod
