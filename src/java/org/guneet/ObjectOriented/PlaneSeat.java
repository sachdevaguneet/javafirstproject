package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class PlaneSeat {
    public int seatNumber; // for e.g A,B,C

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public PlaneSeat(int seatNumber) {
        this.seatNumber = seatNumber;

    }
}
