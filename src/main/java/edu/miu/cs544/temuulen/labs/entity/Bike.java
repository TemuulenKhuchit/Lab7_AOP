package edu.miu.cs544.temuulen.labs.entity;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving at 10 mph.");
    }
}
