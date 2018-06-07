package pl.altkom.decisionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DecisionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecisionServiceApplication.class, args);
    }
}
