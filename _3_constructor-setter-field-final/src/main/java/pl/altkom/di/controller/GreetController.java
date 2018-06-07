package pl.altkom.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.di.service.GreetService;

@RestController
public class GreetController {

    @Autowired
    private GreetService greetService;

//    public void setGreetService(GreetService greetService) {
//        this.greetService = greetService;
//    }
//
//    public GreetController(GreetService greetService) {
//        this.greetService = greetService;
//    }

    @GetMapping("/greet")
    public String greet() {
        return greetService.getMsg();
    }
}
