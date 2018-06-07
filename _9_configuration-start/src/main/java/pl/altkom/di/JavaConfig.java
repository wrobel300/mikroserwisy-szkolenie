package pl.altkom.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import pl.altkom.di.service.GreetService;
import pl.altkom.di.service.GreetServiceFirstImplementation;

@Configuration
// Wyszukanie komponentu (tylko kontroller, serwis jest
// tworzony w metodzie z adnotacją @Bean
@ComponentScan(basePackages = {"pl.altkom.di.controller"})
// Ładowanie propertisów z plików innych niż default
@PropertySource("classpath:service.properties")
public class JavaConfig {


    @Value("${service.first.implementation.msg}")
    public String firstImplMsg;

    @Bean
    @Profile("java")
    public GreetService greetService() {
        return new GreetServiceFirstImplementation(firstImplMsg);
    }
}


