package by.tms.buldenko.hw07.heads;

import java.util.Random;

public class SamsungHead implements IHead {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price = randomNumber;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {System.out.println("Говорит голова Samsung");}

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SamsungHead{" +
                "price=" + price +
                '}';
    }
}