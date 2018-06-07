package pl.altkom.configuration.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "test.property")
public class MainController {

    private String foo;
    private String bar;
    private String x;

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public void setX(String x) {
        this.x = x;
    }

    @GetMapping("/foo")
    public String getFoo() {
        return foo;
    }

    @GetMapping("/bar")
    public String getBar() {
        return bar;
    }


    @GetMapping("/x")
    public String getX() {
        return x;
    }
}
