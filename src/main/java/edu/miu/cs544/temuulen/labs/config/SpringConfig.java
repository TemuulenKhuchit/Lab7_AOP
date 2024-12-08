package edu.miu.cs544.temuulen.labs.config;

import edu.miu.cs544.temuulen.labs.aspects.Logger;
import edu.miu.cs544.temuulen.labs.aspects.VehicleAspect;
import edu.miu.cs544.temuulen.labs.entity.Bike;
import edu.miu.cs544.temuulen.labs.entity.Car;
import edu.miu.cs544.temuulen.labs.entity.Game;
import edu.miu.cs544.temuulen.labs.BeanCounterPostProcessor;
import edu.miu.cs544.temuulen.labs.entity.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    // By default, we have both Car and Bike as in the original code
    @Bean(name = "bike")
    public Vehicle bike() {
        return new Bike(); // prototype behavior can be shown if needed
    }

    @Bean(name = "car")
    public Vehicle car() {
        return new Car();
    }

    @Bean(name = "game")
    public Game myGame() {
        return new Game();
    }

    @Bean
    public Logger logger() {
        return new Logger();
    }

    @Bean
    public VehicleAspect vehicleAspect() {
        return new VehicleAspect();
    }

    @Bean
    public BeanCounterPostProcessor beanCounterPostProcessor() {
        return new BeanCounterPostProcessor();
    }
}
