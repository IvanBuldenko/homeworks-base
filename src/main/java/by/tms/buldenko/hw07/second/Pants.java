package by.tms.buldenko.hw07.second;

public class Pants implements Clothes {
    @Override
    public void putOn() {
        System.out.println("Штаны надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны сняты");
    }
}
