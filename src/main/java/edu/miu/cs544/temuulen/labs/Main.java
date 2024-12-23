package edu.miu.cs544.temuulen.labs;

import edu.miu.cs544.temuulen.labs.config.SpringConfig;
import edu.miu.cs544.temuulen.labs.entity.Game;
import edu.miu.cs544.temuulen.labs.BeanCounterPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("XML:");
        ApplicationContext springContextXML = new ClassPathXmlApplicationContext("config.xml");
        Game game = (Game) springContextXML.getBean("game");
        game.play();

        BeanCounterPostProcessor counterXML = springContextXML.getBean(BeanCounterPostProcessor.class);
        System.out.println("Number of beans created (XML): " + counterXML.getBeanCount());

        System.out.println("\nJava Config:");
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Game game2 = springContext.getBean(Game.class);
        game2.play();

        BeanCounterPostProcessor counterAnn = springContext.getBean(BeanCounterPostProcessor.class);
        System.out.println("Number of beans created: " + counterAnn.getBeanCount());

        springContext.getBean("bike", edu.miu.cs544.temuulen.labs.entity.Vehicle.class);
        springContext.getBean("bike", edu.miu.cs544.temuulen.labs.entity.Vehicle.class);

        System.out.println("Number of beans created: " + counterAnn.getBeanCount());
    }
}
