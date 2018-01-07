package co.com.training.beans.autowireexample;

import co.com.training.interfaces.TeamInterface;

public class Juve implements TeamInterface {
    @Override
    public String showTeam() {
        return "Juve from Italy";
    }
}
