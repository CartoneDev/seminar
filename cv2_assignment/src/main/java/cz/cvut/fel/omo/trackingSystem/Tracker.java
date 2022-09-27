package cz.cvut.fel.omo.trackingSystem;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Tracker is device installed into company vehicles, connected to car computer in order to obtain necessary data.
 */
public class Tracker {

    private static AtomicInteger nextTrackerId = new AtomicInteger();
    private Vehicle vehicle;
    private int innerMemory = 0;
    private int trackerId;

    public Tracker(int trackerId) {
        this.trackerId = trackerId;
    }

    public Tracker(Vehicle vehicle, int trackerId) {
        this.vehicle = vehicle;
        this.trackerId = trackerId;
    }

}
