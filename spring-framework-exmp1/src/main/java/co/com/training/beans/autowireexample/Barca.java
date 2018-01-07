package co.com.training.beans.autowireexample;

import co.com.training.interfaces.TeamInterface;

public class Barca implements TeamInterface {
    @Override
    public String showTeam() {
        return "Barca from Spain";
    }
}
