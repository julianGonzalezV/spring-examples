package co.com.training.beans.autowireexample;

import co.com.training.interfaces.TeamInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class FootballPlayer {
    private int backNumber;
    private String name;
    @Autowired
    @Qualifier("barcelonaQlf")
    private TeamInterface team;

    public int getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(int backNumber) {
        this.backNumber = backNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public TeamInterface getTeam() {
        return team;
    }

   // @Required
    public void setTeam(TeamInterface team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "backNumber=" + backNumber +
                ", name='" + name + '\'' +
                ", team=" + team +
                '}';
    }
}
