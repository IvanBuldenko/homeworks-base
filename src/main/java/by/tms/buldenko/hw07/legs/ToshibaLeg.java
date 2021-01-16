package by.tms.buldenko.hw07.legs;

import java.util.Random;

public class ToshibaLeg implements ILeg {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Медленно ходит");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ToshibaLeg{" +
                "price=" + price +
                '}';
    }
}

