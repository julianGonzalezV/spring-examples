package co.com.training.beans.clasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Y que pasa si se tienen mas cclases dedicadas a la configuración, por si quizas deseamos que
 * clases especificacs confuguren ciertos beans
 */
@Configuration
public class AppConfiguration2 {

    @Bean
    public Greeting otherGreeting(){
        return new Greeting();
    }
}
