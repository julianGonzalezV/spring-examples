package co.com.training.spring;

import co.com.training.beans.Greeting;
import co.com.training.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *Clase que muestra el ejemplo de D injection via xml file
 */
public class App {
    public static void main(String[] args) {
        /*
        ya no hacemos
         Greeting greeting = new Greeting();
         System.out.println(greeting.getSaludo());

         SINO QUE AHORA ES
         */
        //note como se carga la configuracion xml
        ApplicationContext context = new ClassPathXmlApplicationContext("co/com/training/xml/beans.xml");
        Greeting greeting = context.getBean(Greeting.class);

        //TAMBIEN PUEDE SER por medio de factory pattern:
        //Note como se aplica acá el patron factoria, dato un string
        Greeting greeting2 = (Greeting) context.getBean("greetinBean");
        System.out.println(greeting.getSaludo());
        System.out.println(greeting2.getSaludo());



        //Ejemplo de constructor con parámetros
        Person person = (Person) context.getBean("person");
        System.out.println(person);


        //importante para liberar recursos
        ((ConfigurableApplicationContext) context).close();
    }
}
