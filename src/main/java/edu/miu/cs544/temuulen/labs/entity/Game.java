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
        car.move();
        bike.move();
    }
}
