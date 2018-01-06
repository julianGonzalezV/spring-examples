package co.com.training.beans.autowireexample;

import java.util.List;

public class Country {
    private String name;
    private City cityAw;

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
