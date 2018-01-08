package co.com.training.beans.stereotypes;

import co.com.training.interfaces.TeamInterface;
import org.springframework.stereotype.Component;

@Component("juventus")
public class Juve implements TeamInterface {
    @Override
    public String showTeam() {
        return "Juve from Italy";
    }
}
