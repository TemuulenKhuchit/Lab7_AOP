package edu.miu.cs544.temuulen.labs.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {
    @Autowired
    private Vehicle bike;

    @Autowired
    private Vehicle car;

    public Game() {
    }

    public void play() {
        car.move();
        bike.move();
    }

    public Vehicle getBike() {
        return bike;
    }

    public Vehicle getCar() {
        return car;
    }
}
