package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class PlaneRow {
    public int rowNumber;    // for e.g 1,2,3
    public PlaneSeat[] seats;   // A,B,C,D,E,F

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public PlaneSeat[] getSeats() {
        return seats;
    }

    public void setSeats(PlaneSeat[] seats) {
        this.seats = seats;
    }

    public PlaneRow(int rowNumber, PlaneSeat[] seats) {
        this.rowNumber = rowNumber;
        this.seats = seats;

    }
}
