package org.mars_sim.rest;

import org.mars_sim.rest.model.Simulation;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public Simulation getSimulation(ApplicationArguments args) {
        System.out.println("Commandline args = " + args);
        return new Simulation();
    }
}