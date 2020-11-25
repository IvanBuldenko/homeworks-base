package by.tms.buldenko.hw06;

public class GroundTransport extends Transport {
    int numberOfWheels;
    int fuelConsumption;

    @Override
    public String toString() {
        return super.toString() +
                "numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", ";
    }
}
