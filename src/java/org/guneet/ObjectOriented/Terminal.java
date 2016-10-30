package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class Terminal {
    public String name;// A,B,C
    Gate[] gates; //

    public Gate[] getGates() {
        return gates;
    }

    public void setGates(Gate[] gates) {
        this.gates = gates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Terminal(String name, Gate[] gates) {
        this.name = name;
        this.gates = gates;

    }
}
