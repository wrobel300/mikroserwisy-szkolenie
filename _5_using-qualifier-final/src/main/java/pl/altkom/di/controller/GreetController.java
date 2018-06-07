package pl.altkom.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.di.service.GreetService;

@RestController
public class GreetController {

    @Autowired
    @Qualifier("second")
    private GreetService greetService;

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}
