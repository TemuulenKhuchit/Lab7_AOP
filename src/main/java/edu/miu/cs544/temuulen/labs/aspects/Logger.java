package edu.miu.cs544.temuulen.labs.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// This logger just logs before and after Game methods for demonstration.
// Additional functionality will be in VehicleAspect.
@Aspect
public class Logger {
    @Before("execution(* edu.miu.cs544.temuulen.labs.entity.Game.*())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before : " + joinPoint.getSignature().getName());
    }

    @After("execution(* edu.miu.cs544.temuulen.labs.entity.Game.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After : " + joinPoint.getSignature().getName());
    }
}
