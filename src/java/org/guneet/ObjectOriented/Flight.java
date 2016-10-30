package org.guneet.ObjectOriented;

import java.util.Date;

/**
 * Created by gunee on 3/26/2016.
 */
public class Flight {
    public String Number;    // SA1875
    Route route;
    Date  departureDate;  // specific day of the route
    Date arrivalDate;     // specific day of the route
    PlaneModel planeModel;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public PlaneModel getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(PlaneModel planeModel) {
        this.planeModel = planeModel;
    }

    public Flight(String number, Route route, Date departureDate, Date arrivalDate, PlaneModel planeModel) {
        Number = number;
        this.route = route;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.planeModel = planeModel;

    }
}
