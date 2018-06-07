package pl.altkom.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetControllerController {


    private GreetService greetService;

    @Autowired
    public GreetControllerController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}


