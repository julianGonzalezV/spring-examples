package co.com.training.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Greeting greetingBean(){
        return new Greeting();
    }

}
