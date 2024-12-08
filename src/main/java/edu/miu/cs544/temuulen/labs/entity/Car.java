package edu.miu.cs544.temuulen.labs.entity;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving at 50 mph.");
    }
}
