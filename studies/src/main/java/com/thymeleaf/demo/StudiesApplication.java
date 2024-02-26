package com.thymeleaf.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudiesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
