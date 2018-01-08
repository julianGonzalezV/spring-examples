package co.com.training.beans.stereotypes;

import co.com.training.interfaces.TeamInterface;
import org.springframework.stereotype.Component;

@Component("barcelonaQlf")
public class Barca implements TeamInterface {
    @Override
    public String showTeam() {
        return "Barca from Spain";
    }
}
