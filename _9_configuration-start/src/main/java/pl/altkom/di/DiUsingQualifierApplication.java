package pl.altkom.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:spring.xml")
// TODO 8 dodaj @ImportResource (dla ładowania konfiguracji XML przy starcie aplikacji)
public class DiUsingQualifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiUsingQualifierApplication.class, args);
    }
}


// TODO 2 w pakiecie pl.altkom.di.service dodaj GreetServiceSecondImplementation zwracający inny msg
// TODO 3 przejdź do spring.xml - skonfiguruj aplikację