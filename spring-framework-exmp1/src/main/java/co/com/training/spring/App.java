package co.com.training.spring;

import co.com.training.beans.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*
        ya no hacemos
         Greeting greeting = new Greeting();
         System.out.println(greeting.getSaludo());

         SINO QUE AHORA ES
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("co/com/training/xml/beans.xml");

        Greeting greeting = context.getBean(Greeting.class);

        //TAMBIEN PUEDE SER:
        //vea como se aplica acá el patron factoria, dato un string
        Greeting greeting2 = (Greeting) context.getBean("greetinBean");

        System.out.println(greeting.getSaludo());
        System.out.println(greeting2.getSaludo());

    }
}
