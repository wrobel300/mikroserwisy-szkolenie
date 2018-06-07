package pl.altkom.diexercisesolution.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import static pl.altkom.diexercisesolution.FinalExerciseSolutionApplication.DEV_PROFILE;

@Service
@Profile(DEV_PROFILE)
public class MessageServiceDevImpl implements MessageService {

    @Value("${example.value.foo}")
    private String foo;

    @Value("${example.value.bar}")
    private String bar;

    @Value("${example.value.x}")
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

}
