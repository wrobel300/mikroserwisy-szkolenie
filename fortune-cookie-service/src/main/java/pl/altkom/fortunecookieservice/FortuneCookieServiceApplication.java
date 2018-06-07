package pl.altkom.fortunecookieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class FortuneCookieServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortuneCookieServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate ribbonRestTemplate() {
        return new RestTemplate();
    }

}
