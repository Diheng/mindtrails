package edu.virginia.psyc.pi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * This is a Spring based application, and will auto discover the 
 * controllers in this code base and make them available
 *  as web endpoints.
 */
@ComponentScan("org.virginia.psyc")  // Search for controllers and data access objects in both Core and App projects.
@EnableAutoConfiguration  // Automatically configure everything ala Spring Boot
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}