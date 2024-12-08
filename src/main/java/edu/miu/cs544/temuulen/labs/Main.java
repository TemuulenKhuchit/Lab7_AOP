package edu.miu.cs544.temuulen.labs;

import edu.miu.cs544.temuulen.labs.entity.Game;
import edu.miu.cs544.temuulen.labs.entity.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext springContextXML = new ClassPathXmlApplicationContext("config.xml");
        Game game = (Game) springContextXML.getBean("game");
        game.play();

//        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Game game2 = springContext.getBean(Game.class);
//        game2.play();
    }
}