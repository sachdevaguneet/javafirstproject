package org.guneet.ObjectOriented;

import java.util.Date;

/**
 * Route from SJC to LAX is different from the route
 * From LAX to SJC.
 * Created by gunee on 3/26/2016.
 */
public class Route {
    Airport sourceAirport; // SJC
    Airport destAirport; //LAX
    Date departureTime;   // 12:30PM
    Date arrivalTime; // 1:37PM

    public Airport getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(Airport sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public Airport getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(Airport destAirport) {
        this.destAirport = destAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Route(Airport sourceAirport, Airport destAirport, Date departureTime, Date arrivalTime) {
        this.sourceAirport = sourceAirport;
        this.destAirport = destAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

    }
}
