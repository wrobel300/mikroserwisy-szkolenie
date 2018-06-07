package pl.altkom.diexercisesolution.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static pl.altkom.diexercisesolution.FinalExerciseSolutionApplication.PROD_PROFILE;

@Service
@Profile(PROD_PROFILE)
@ConfigurationProperties(prefix = "example.value")
public class MessageServiceProdImpl implements MessageService {

    private String foo;
    private String bar;
    private int x;

    @Override
    public String foo() {
        return foo;
    }

    @Override
    public String bar() {
        return bar;
    }

    @Override
    public int x() {
        return x;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public void setX(int x) {
        this.x = x;
    }
}