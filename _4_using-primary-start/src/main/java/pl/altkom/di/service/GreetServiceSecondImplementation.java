package pl.altkom.di.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceSecondImplementation implements GreetService {
    @Override
    public String getMsg() {
        return MSG + " second";
    }
}
