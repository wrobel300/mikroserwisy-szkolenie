package pl.altkom.diexercisesolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class FinalExerciseSolutionApplication {
    public static final String DEV_PROFILE = "dev";
    public static final String PROD_PROFILE = "prod";

    public static void main(String[] args) {
        SpringApplication.run(FinalExerciseSolutionApplication.class, args);
    }
}
