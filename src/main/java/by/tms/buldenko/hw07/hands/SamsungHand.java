package by.tms.buldenko.hw07.hands;

import java.util.Random;

public class SamsungHand implements IHand {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Начинают вращаться руки");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SamsungHand{" +
                "price=" + price +
                '}';
    }
}
