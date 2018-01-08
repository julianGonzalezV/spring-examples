package co.com.training.beans.stereotypes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * La idea con esta clase es mostrar como se haría la inyección de dependencias vía constructor, vaya al xml para que evidencie el resultado
 */
public class Person {
    private int id;
    private String name;
    private String nickname;

    //los vamos a inyectar por set
    private Country country;

    /**
     * Metodo que se ejecutara al inicializar el bean
     * llamelo como desee
     */
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


    public Person(int id, String name, String nickname ) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    //NOTE que no hay Sets

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getNickname() {
        return nickname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", country=" + country +
                '}';
    }
}
