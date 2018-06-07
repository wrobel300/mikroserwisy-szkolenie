package pl.altkom.di.service;

public class GreetServiceSecondImplementation implements GreetService {

    public String secondMessage;

    public GreetServiceSecondImplementation(String secondMessage) {
        this.secondMessage = secondMessage;
    }

    @Override
    public String getMsg() {
        return MSG + " " + secondMessage;
    }
}
