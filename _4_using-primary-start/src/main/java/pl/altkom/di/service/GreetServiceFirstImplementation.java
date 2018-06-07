package pl.altkom.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetServiceFirstImplementation implements GreetService {
    @Override
    public String getMsg() {
        return MSG + " first";
    }
}
