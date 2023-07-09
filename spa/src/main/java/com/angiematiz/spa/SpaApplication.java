package com.angiematiz.spa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@EnableConfigurationProperties
@SpringBootApplication
public class SpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaApplication.class, args);
    }

}
