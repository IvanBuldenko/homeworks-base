package by.tms.buldenko.hw06;

public class MilitaryTransport extends AirTranspoort {
    boolean systemOfBailOut;
    int numberOfRockets;

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                super.toString() +
                "systemOfBailOut=" + systemOfBailOut +
                ", numberOfRockets=" + numberOfRockets +
                ", kW=" + getkW() +
                '}';
    }

    public void shots() {
            if (numberOfRockets > 0) {
                System.out.println("Ракета пошла...");
        }
    }
    public void bailOut () {
        if (systemOfBailOut==true) {
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("У вас нет такой системы");
        }
    }
}
