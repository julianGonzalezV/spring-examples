package co.com.training.spring;

import co.com.training.beans.AppConfiguration;
import co.com.training.beans.AppConfiguration2;
import co.com.training.beans.Greeting;
import co.com.training.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *Clase que muestra el ejemplo de D injection sin xml file, vaya a App.java si desea saber como es con xml
 */
public class App2 {
    public static void main(String[] args) {

        //note como se carga la configuracion pasándole la clase que tendrá la definicion de los beans
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class, AppConfiguration2.class);


        //TAMBIEN PUEDE SER por medio de factory pattern:
        //Note como se aplica acá el patron factoria, dato un string
        //tambiennote que el factory si funciona cambie greetingBean a greetinBean sin g y no funcionará!
        Greeting greeting1 = (Greeting) context.getBean("greetingBean");
        Greeting greeting2 = (Greeting) context.getBean("otherGreeting");
        System.out.println(greeting1.getSaludo());
        System.out.println(greeting2.getSaludo());



        //importante para liberar recursos
        ((ConfigurableApplicationContext) context).close();
    }
}
