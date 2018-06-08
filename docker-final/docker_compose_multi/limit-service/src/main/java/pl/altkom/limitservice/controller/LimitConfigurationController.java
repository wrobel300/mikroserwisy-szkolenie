package pl.altkom.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.limitservice.model.Configuration;
import pl.altkom.limitservice.model.LimitConfiguration;

@RestController
public class LimitConfigurationController {

    private Configuration configuration;

    @Autowired
    public LimitConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    LimitConfiguration limits() {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
