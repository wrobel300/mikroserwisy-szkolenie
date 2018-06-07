package pl.altkom.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import pl.altkom.configuration.service.GreetService;
import pl.altkom.configuration.service.GreetServiceFirstImplementation;

@Configuration
@ComponentScan(basePackages = {"pl.altkom.configuration.controller"})
@PropertySource("classpath:service.properties")
public class JavaConfig {

    @Value("${service.first.implementation.msg}")
    public String firstImplMsg;

    @Bean
    @Profile("java")
    public GreetService firstImpl() {
        return new GreetServiceFirstImplementation(firstImplMsg);
    }
}


