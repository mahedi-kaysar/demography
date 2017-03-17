package demograpy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mahedi on 3/15/2017.
 */

/*
    annotation applies the default configuration settings
    for our Spring Boot application (finds and loads all entities,
    controllers, UI templates and other application assets
 */
@SpringBootApplication
public class DemographyApplication {
    public static void main(String[] args){
        SpringApplication.run(DemographyApplication.class,args);
    }
}
