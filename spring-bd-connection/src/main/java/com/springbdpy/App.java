package com.springbdpy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurationTask1.class);

        Player player1 = (Player) context.getBean("player");
        System.out.println("****************CREATED PLAYER************************");
        System.out.println(player1);
        System.out.println("****************END CREATED PLAYER********************");


        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose  a team : 1-Barcelona ;  2-Juventus");
            String choosedTeam = scanner.next();

            switch (choosedTeam){
                case "1":
                    System.out.println("opcion Barca");
                    player1.setTeam((Barca)context.getBean("barca"));
                    break;
                case "2":
                    System.out.println("Opción Juve");
                    player1.setTeam((Juve)context.getBean("juve"));
                    break;
                default:
                    System.out.println("opcion no válida");
                    ((ConfigurableApplicationContext) context).close();
                    break;

            }
            //new team!
            System.out.println("****************UPDATED PLAYER************************");
            System.out.println(player1);
            System.out.println("****************END UPDATED PLAYER********************");
        }


    }
}
