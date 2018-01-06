package co.com.training.beans.clasic;

import java.util.List;

public class Country {
    private String name;
    private City city;

    private List<City> cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", cities=" + cities +
                '}';
    }
}
