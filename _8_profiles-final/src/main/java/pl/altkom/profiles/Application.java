package pl.altkom.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.altkom.db.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"pl.altkom.configuration", "pl.altkom.db"})
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        String url = ctx.getBean("datasource", FakeDataSource.class).getUrl();
        int port = ctx.getBean("datasource", FakeDataSource.class).getPort();
        System.out.println(String.format("#############  Datasource url: %s; port %d ##############", url, port));
        ((ConfigurableApplicationContext) ctx).close();

    }
}

// TODO 1 utwórz pakiety:
//                          pl.altkom.configuratiom
//                          pl.altkom.db

// TODO 2 utwórz konfiguracjęDataSourceConfiguration z 2 definicjami beanów FakeDataSource:
//                          definicje będą zwracały bean'y o nazwie 'datasource'
//                          jedna, profile 'development'
//                          druga, profil 'production'
//                          utwórz obiekty o różnych wartościach pól url i port

// TODO 3 zmień defaultow'e skanowanie komponentów dla SpringBoot - dla pakietów 'wychodzących' poza pl.altkom.profiles

// TODO 4 dodaj wpis w application.properties : spring.profiles.active=development

// TODO 5 w metodzie Application#main pobierz z kontekstu bean'a datasource i wylistuj url i port, zamknij kontekst

// TODO 6 zmień aktywny profil na production i uruchom aplikację  - czy coś się zmieniło?