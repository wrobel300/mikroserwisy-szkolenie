package pl.altkom.configuration.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // TODO 4 utwórz metodę obsługującą GET, "/hello"Ł
    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {
        return env.getProperty("helloController.hello");
    }

    @GetMapping("/msg")
    public String msg() {
        return env.getProperty("helloController.msg");
    }

    @GetMapping("/foo")
    public String foo() {
        return env.getProperty("helloController.foo");
    }

    // TODO 6 utwórz metodę obsługującą GET, "/msg"

    // TODO 8 utwórz metodę obsługującą GET, "/foo"
}


