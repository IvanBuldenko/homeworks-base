package by.tms.buldenko.hw07.legs;

import java.util.Random;

public class SonyLeg implements ILeg {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Начинает приседать");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SonyLeg{" +
                "price=" + price +
                '}';
    }
}
