package by.tms.buldenko.hw06;

public class FreightTransport extends GroundTransport {
    int maxHeight;

    @Override
    public String toString() {
        return "FreightTransport{" +
                super.toString() +
                "maxHight=" + maxHeight +
                ", kW= " + getkW() +
                '}';
    }

    public void CheckingMachineLoading (int weight) {
        if (weight <= maxHeight) {
            System.out.println("Грузовик загружен");}
            else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
