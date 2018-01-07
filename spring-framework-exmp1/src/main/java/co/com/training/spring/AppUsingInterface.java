package co.com.training.spring;

import co.com.training.beans.autowireexample.FootballPlayer;
import co.com.training.beans.clasic.Greeting;
import co.com.training.beans.clasic.Person;
import co.com.training.interfaces.TeamInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *Clase que muestra el ejemplo de D injection via xml file
 */
public class AppUsingInterface {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("co/com/training/xml/beansInterfacesExample.xml");
        FootballPlayer player1 = (FootballPlayer) context.getBean("messi");
        System.out.println(player1+" - "+player1.getTeam().showTeam());

        TeamInterface team1 = (TeamInterface)  context.getBean("barcelona");
        //Con  un strategy le podemos configurar el team de un jugador vía file properties
        TeamInterface team2 = (TeamInterface)  context.getBean("juventus");

        System.out.println("team - "+team1.showTeam());
        System.out.println("team - "+team2.showTeam());

        ((ConfigurableApplicationContext) context).close();
    }
}
