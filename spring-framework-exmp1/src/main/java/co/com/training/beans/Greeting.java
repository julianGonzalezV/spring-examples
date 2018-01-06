package co.com.training.beans;

import org.springframework.beans.factory.annotation.Value;

public class Greeting {

    //note como en el xml se le pasa un valor por defecto, pero sí lo deseamos todo por anotaciones entonces @Value es la
    //solución
    @Value("default value!")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
