package by.tms.buldenko.hw06;

public class LightTransport extends GroundTransport {
    String typeOf;
    int numberOfPassengers;

    @Override
    public String toString() {
        return "LightTransport{" +
                super.toString() +
                " typeOf='" + typeOf + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", kW= " + getkW() +
                " }";
    }

    public int kmForTime(int time) {
        return maxSpeed * time;
    }

    private double fuelForTime(int time) {
        return kmForTime(time) / 100 * 8;
    }

    public double getFuelForTime(int time) {
        return fuelForTime(time);
    }

}
