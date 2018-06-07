package pl.altkom.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


// TODO 1 utwórz pakiety pl.altkom.di.controller i pl.altkom.di.service
// TODO 2 w pakiecie ... controller, utwórz GreetController i oznacz adnotacją właściwą dla kontrolera
// TODO 3 w pakiecie ... service, utwórz GreetService i oznacz adnotacją właściwą dla serwisu

// TODO 4 w GreetService zdefiniuj metodę getMsg() zwracającą "Hello World!"
// TODO 5 w GreetController zdefiniuj metodę String greet() obsługującą URI "/greet"
// TODO 6 wstrzyknij do kontrolera GreetService
// TODO 7 wywołaj metodę serwisową w metodzie kontrolera
