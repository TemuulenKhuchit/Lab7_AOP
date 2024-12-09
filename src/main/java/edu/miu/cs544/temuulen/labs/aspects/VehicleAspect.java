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

    @After("execution(* edu.miu.cs544.temuulen.labs.entity.Car.move(..))")
    public void afterCarMove() {
        System.out.println("the car is moving");
    }

    @After("execution(* edu.miu.cs544.temuulen.labs.entity.Bike.move(..))")
    public void afterBikeMove() {
        System.out.println("the bike is moving");
    }
}
