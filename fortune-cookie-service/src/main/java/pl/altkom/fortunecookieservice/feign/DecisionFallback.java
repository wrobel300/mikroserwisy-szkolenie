package pl.altkom.fortunecookieservice.feign;

import org.springframework.stereotype.Component;

@Component
public class DecisionFallback implements DecisionClient {

    @Override
    public String getResponse() {
        return "{\"decision\": \" or not...\"}";
    }
}
