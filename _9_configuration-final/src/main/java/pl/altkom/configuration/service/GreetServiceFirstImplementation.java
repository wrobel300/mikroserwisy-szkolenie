package pl.altkom.configuration.service;

public class GreetServiceFirstImplementation implements GreetService {

    private String firstImpl;

    @Override
    public String getMsg() {
        return MSG + " " + firstImpl;
    }

    public GreetServiceFirstImplementation(String msg) {
        firstImpl = msg;
    }
}
