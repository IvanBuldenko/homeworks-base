package by.tms.buldenko.hw07.hands;

import java.util.Random;

public class ToshibaHand implements IHand {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;
    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Руки медленно поднимаются вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ToshibaHand{" +
                "price=" + price +
                '}';
    }
}
