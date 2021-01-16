package by.tms.buldenko.hw07.heads;

import java.util.Random;

public class ToshibaHead implements IHead {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price =randomNumber;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {System.out.println("Говорит голова Toshiba");}

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ToshibaHead{" +
                "price=" + price +
                '}';
    }
}