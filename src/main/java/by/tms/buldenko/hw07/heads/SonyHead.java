package by.tms.buldenko.hw07.heads;

import java.util.Random;

public class SonyHead implements IHead {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SonyHead{" +
                "price=" + price +
                '}';
    }
}
