package pl.altkom.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.configuration.service.GreetService;

@RestController
public class GreetController {

    @Autowired
    private GreetService greetService;

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}
