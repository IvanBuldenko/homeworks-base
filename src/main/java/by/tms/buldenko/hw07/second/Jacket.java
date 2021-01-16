package by.tms.buldenko.hw07.second;

public class Jacket implements Clothes {

    @Override
    public void putOn() {
        System.out.println("Куртка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка снята");
    }
}
