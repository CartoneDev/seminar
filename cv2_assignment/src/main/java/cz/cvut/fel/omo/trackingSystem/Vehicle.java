package cz.cvut.fel.omo.trackingSystem;

/**
 * Class Vehicle represents a single car in company car park.
 */
public class Vehicle {

    private int mileage = 0;
    private final String manufacturer;
    private final String vinCode;

    public Vehicle(String manufacturer, String vinCode) {
        this.manufacturer = manufacturer;
        this.vinCode = vinCode;
    }

    public String getVinCode() {
        return vinCode;
    }
}
