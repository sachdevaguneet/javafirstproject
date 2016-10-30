package org.guneet.ObjectOriented;

/**
 * Created by gunee on 3/26/2016.
 */
public class SeatingLocation {
    public PlaneSeat seat;   // for e.g D
    public PlaneRow reo; // for e.g 7

    public PlaneSeat getSeat() {
        return seat;
    }

    public void setSeat(PlaneSeat seat) {
        this.seat = seat;
    }

    public PlaneRow getReo() {
        return reo;
    }

    public void setReo(PlaneRow reo) {
        this.reo = reo;
    }

    public SeatingLocation(PlaneSeat seat, PlaneRow reo) {
        this.seat = seat;
        this.reo = reo;

    }
}
