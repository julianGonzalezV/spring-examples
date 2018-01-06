package co.com.training.beans;

/**
 * La idea con esta clase es mostrar como se haría la inyección de dependencias vía constructor, vaya al xml para que evidencie el resultado
 */
public class Person {
    private int id;
    private String name;
    private String nickname;

    //los vamos a inyectar por set
    private Country country;
    private City city;

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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", country=" + country +
                ", city=" + city +
                '}';
    }
}
