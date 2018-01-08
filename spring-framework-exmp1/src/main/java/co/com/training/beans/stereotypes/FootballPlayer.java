package co.com.training.beans.stereotypes;

import co.com.training.interfaces.TeamInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballPlayer {
    private int backNumber;
    @Value("Lionel messi comp")
    private String name;
    @Autowired
    //@Qualifier("barcelonaQlf") NO fuera NECESARIO si no tuvieramos  DOS INSTANCIAS
    //juve y barca
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

    //@Required
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
