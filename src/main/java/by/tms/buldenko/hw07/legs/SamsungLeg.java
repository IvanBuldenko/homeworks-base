package by.tms.buldenko.hw07.legs;

import java.util.Random;

public class SamsungLeg implements ILeg {

    Random random = new Random();
    int randomNumber = random.nextInt(5)+1;

    private int price =randomNumber;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Прыгает");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SamsungLeg{" +
                "price=" + price +
                '}';
    }
}
