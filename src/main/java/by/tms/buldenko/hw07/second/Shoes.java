package by.tms.buldenko.hw07.second;

public class Shoes implements Clothes {

    @Override
    public void putOn() {
        System.out.println("Обувь надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Обувь сняли");
    }
}
