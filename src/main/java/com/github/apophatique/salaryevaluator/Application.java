package com.github.apophatique.salaryevaluator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the application.
 */
@SpringBootApplication
public class Application {
    /**
     * Constructor off the class.
     */
    protected Application() {}
    /**
     * Main method of Application class.
     * @param args Command args parameter.
     */
    public static void main(final String[] args) {
        SpringApplication.run(com.github.apophatique.salaryevaluator.Application.class, args);
    }
}