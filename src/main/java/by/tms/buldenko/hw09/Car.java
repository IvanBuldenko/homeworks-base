package by.tms.buldenko.hw09;

import java.util.Random;

public class Car {
    String mark;
    int speed;
    int price;
    int randomValue;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public void start () {
        Random random = new Random();
        int randomValue = random.nextInt(20);
        System.out.println(randomValue);
        if (randomValue %2 == 0) {
            System.out.println("Машина " + mark + " завелась");
        }
        else {
            try {
                throw new MyException("Тебе не повезло....");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
