package pl.altkom.di.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.di.service.GreetService;

@RestController
public class GreetController {

    private GreetService greetService;

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}
