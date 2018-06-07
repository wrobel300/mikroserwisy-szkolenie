package pl.altkom.fortunecookieservice.feign;

import org.springframework.stereotype.Component;

@Component
public class ActivityFallback implements ActivityClient {
    @Override
    public String getResponse() {
        return "{\"activity\": \" or not...\"}";
    }
}
