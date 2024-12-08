package edu.miu.cs544.temuulen.labs.entity;

import org.springframework.context.annotation.Bean;

public class SpringConfig {
    @Bean(name = "bike")
    public Vehicle bike() {
        return new Bike();
    }

    @Bean(name = "car")
    public Vehicle car() {
        return new Car();
    }

    @Bean(name = "game")
    public Game myGame() {
        return new Game();
    }
}
