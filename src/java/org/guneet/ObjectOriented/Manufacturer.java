package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class Manufacturer {
    public String name;   // For example. Airbus, Boeing
    public PlaneModel[] model; // For example 757,756,767\;
    public int y;

    public Manufacturer(PlaneModel[] model, String name) {
        this.model = model;
        this.name = name;
    }

    public PlaneModel[] getModel() {
        return model;
    }

    public void setModel(PlaneModel[] model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
