package pl.altkom.di.service.impl;

import org.springframework.stereotype.Service;
import pl.altkom.di.service.GreetService;

@Service
public class GreetServiceSecondImplementation implements GreetService {

    public static String SECOND_IMPL = " from the second implementation.";

    @Override
    public String getMsg() {
        return MSG + SECOND_IMPL;
    }
}
