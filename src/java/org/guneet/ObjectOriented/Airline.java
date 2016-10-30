package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class Airline {
    String name; // for eg. Swiss Air, Lufthansa, United
    Route[] routes;  // multiple routes supported

    public Airline(Route[] routes, String name) {
        this.routes = routes;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Route[] getRoutes() {
        return routes;
    }

    public void setRoutes(Route[] routes) {
        this.routes = routes;
    }
}
