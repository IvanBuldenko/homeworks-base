package by.tms.buldenko.hw07.hands;

import java.util.Random;

public class SonyHand implements IHand {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Руки быстро начинают хлопать");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SonyHand{" +
                "price=" + price +
                '}';
    }
}
