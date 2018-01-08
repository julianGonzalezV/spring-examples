package co.com.training.beans.task1;

import co.com.training.beans.clasic.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration NECESARIO PARA QUE SPRING RECONOZCA QUE VA A SER LA CLASE DE CONFIGURACION
@Configuration
public class AppConfigurationTask1 {

    @Bean
    public Player player(){
        return new Player();
    }
    @Bean
    public Barca barca() {return new Barca();}
    @Bean
    public Juve juve() {return new Juve();}
    @Bean
    public TShirt shirt(){return new TShirt();}
    @Bean
    public ShirtBrand brand(){return new ShirtBrand();}

}
