package edu.miu.cs544.temuulen.labs.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {
    @Autowired
    private Bike bike;

    @Autowired
    private Car car;

    public Game() {
    }

    public void play() {
        // We try to move both for demonstration, but the aspect will control if allowed.
        car.move();
        bike.move();
    }

    public Bike getBike() {
        return bike;
    }

    public Car getCar() {
        return car;
    }
}
