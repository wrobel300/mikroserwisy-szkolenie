package pl.altkom.di.service;

import org.springframework.stereotype.Service;

// TODO 2 nazwij Serwis
@Service("service1")
public class GreetServiceSecondImplementation implements GreetService {

    public static String SECOND_IMPL = " from the second implementation.";

    @Override
    public String getMsg() {
        return MSG + SECOND_IMPL;
    }
}
