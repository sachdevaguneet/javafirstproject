package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class Ticket {
    String id;
    Flight flight;
    SeatingLocation seatingLocation;
    Passenger passenger;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public SeatingLocation getSeatingLocation() {
        return seatingLocation;
    }

    public void setSeatingLocation(SeatingLocation seatingLocation) {
        this.seatingLocation = seatingLocation;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket(String id, Flight flight, SeatingLocation seatingLocation, Passenger passenger) {
        this.id = id;
        this.flight = flight;
        this.seatingLocation = seatingLocation;
        this.passenger = passenger;

    }
}
