package com.example.demoexams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class DemoExamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoExamsApplication.class, args);
    }

}
