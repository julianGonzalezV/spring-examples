package co.com.training.spring;

import co.com.training.beans.stereotypes.FootballPlayer;
import co.com.training.interfaces.TeamInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *Clase que muestra el ejemplo de D injection via xml file
 */
public class AppStereoTypes {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("co/com/training/xml/beansStereoTypeExample.xml");
         /*el stereoType Component hace que debamos colocar el Id como el nombre de la clase
          * note como se ahorra líneas de configuración en el xml */
        FootballPlayer player1 = (FootballPlayer) context.getBean("footballPlayer");
        System.out.println(player1+" - "+player1.getTeam().showTeam());

        TeamInterface team1 = (TeamInterface)  context.getBean("barcelonaQlf");
        //Con  un strategy le podemos configurar el team de un jugador vía file properties
        TeamInterface team2 = (TeamInterface)  context.getBean("juventus");

        System.out.println("team - "+team1.showTeam());
        System.out.println("team - "+team2.showTeam());

        ((ConfigurableApplicationContext) context).close();
    }
}
