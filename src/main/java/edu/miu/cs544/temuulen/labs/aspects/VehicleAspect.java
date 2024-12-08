package edu.miu.cs544.temuulen.labs.aspects;

import edu.miu.cs544.temuulen.labs.entity.Bike;
import edu.miu.cs544.temuulen.labs.entity.Car;
import edu.miu.cs544.temuulen.labs.entity.Game;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class VehicleAspect {

    // #1: Only allow play() if the vehicle type is Car.
    // Since Game uses both Car and Bike, let's define logic:
    // If Game has both Car and Bike, we can say only proceed if Car is present and Bike is NOT desired alone.
    // For simplicity, if Bike is present, we'll block play. In a real scenario, you'd have a different logic.
    @Around("execution(* edu.miu.cs544.temuulen.labs.entity.Game.play(..))")
    public Object onlyAllowCar(ProceedingJoinPoint pjp) throws Throwable {
        Game game = (Game) pjp.getTarget();
        if (game.getCar() != null && game.getBike() == null) {
            return pjp.proceed();
        } else {
            System.out.println("Play is not allowed because the vehicle is not exclusively a Car.");
            return null;
        }
    }

    // #2: Log "the car is moving" or "the bike is moving" after move() calls.
    @After("execution(* edu.miu.cs544.temuulen.labs.entity.Car.move(..))")
    public void afterCarMove() {
        System.out.println("the car is moving");
    }

    @After("execution(* edu.miu.cs544.temuulen.labs.entity.Bike.move(..))")
    public void afterBikeMove() {
        System.out.println("the bike is moving");
    }
}
