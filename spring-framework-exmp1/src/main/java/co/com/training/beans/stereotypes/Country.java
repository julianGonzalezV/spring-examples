package co.com.training.beans.stereotypes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Country {
    private String name;
    private City cityAw;

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

    //private List<City> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public City getCityAw() {
        return cityAw;
    }

    public void setCityAw(City city) {
        this.cityAw = city;
    }

    /*
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
    */

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", city=" + cityAw +
                //", cities=" + cities +
                '}';
    }
}
