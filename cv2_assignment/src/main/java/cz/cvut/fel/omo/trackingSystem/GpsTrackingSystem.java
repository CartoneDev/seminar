package cz.cvut.fel.omo.trackingSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuki on 22/09/2017.
 * GpsTrackingSystem class represents the newly introduced tool for gaining control over company car park.
 */
public class GpsTrackingSystem {

    private List<Tracker> activeTrackers = new ArrayList<>();
    private Integer counter = 0;

    public GpsTrackingSystem(Integer counter) {
        this.counter = counter;
    }
}
