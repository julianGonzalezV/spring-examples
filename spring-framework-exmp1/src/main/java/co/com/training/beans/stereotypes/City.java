package co.com.training.beans.stereotypes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class City {
    private String name;

    @PostConstruct
    private void initX(){
        System.out.println("Inciando "+getClass());
    }

    /**
     * metodo que se ejecutará al destruir el bea para liberar recursos desde el App.java
     * llamelo como desee
     */
    @PreDestroy
    private void destroyX(){
        System.out.println("Finalizando "+getClass());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
