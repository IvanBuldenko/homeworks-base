package by.tms.buldenko.hw06;

public class AirTranspoort extends Transport {
    int weight;
    int minimalLongOfFlyLine;

    @Override
    public String toString() {
        return
                super.toString() +
                "weight=" + weight +
                ", minimalLongOfFlyLine= " + minimalLongOfFlyLine +
                ", ";
    }
}
