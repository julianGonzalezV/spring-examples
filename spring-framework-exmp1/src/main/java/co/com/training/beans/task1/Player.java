package co.com.training.beans.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Value("1234546")
    private String id;
    @Value("Juliano Ronaldo")
    private String name;
    @Autowired
    @Qualifier("barcelonaFier")
    private Team team;
    @Autowired
    private TShirt shirt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public TShirt getShirt() {
        return shirt;
    }

    public void setShirt(TShirt shirt) {
        this.shirt = shirt;
    }


    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", team=" + team +
                ", shirt=" + shirt +
                '}';
    }
}
