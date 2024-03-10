package com.liveasy.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  The CrudApiImplementationApplication class serves as the entry point for the CRUD API implementation application.
 *  It is annotated with SpringBootApplication, indicating that it is a Spring Boot application
 *  and enabling autoconfiguration and component scanning
 */
@SpringBootApplication
public class CrudApiImplementationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApiImplementationApplication.class, args);
    }

}
