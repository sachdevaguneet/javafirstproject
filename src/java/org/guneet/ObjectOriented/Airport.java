package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class Airport {
    public String name;// ex. SFO or SJC
    Terminal[] terminals;

    public Airport(String name, Terminal[] terminals) {
        this.name = name;
        this.terminals = terminals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Terminal[] getTerminals() {
        return terminals;
    }

    public void setTerminals(Terminal[] terminals) {
        this.terminals = terminals;
    }
}
