package pl.altkom.di.service;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public String getMsg() {
        return "Hello World!";
    }
}
