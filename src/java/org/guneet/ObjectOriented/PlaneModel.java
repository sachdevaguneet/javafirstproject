package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class PlaneModel {
    public String name;//747, 767
    public PlaneRow[] rows;   // multiple rows in a plane

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlaneRow[] getRows() {
        return rows;
    }

    public void setRows(PlaneRow[] rows) {
        this.rows = rows;
    }

    public PlaneModel(String name, PlaneRow[] rows) {
        this.name = name;
        this.rows = rows;

    }
}