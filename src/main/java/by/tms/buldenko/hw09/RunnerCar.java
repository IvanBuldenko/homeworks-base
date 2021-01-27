package by.tms.buldenko.hw09;

import java.util.Random;

public class RunnerCar {
    public static void main(String[] args) {
        Car bmw = new Car("BMW",130,6000);
        Car ford = new Car("Ford",120,4500);
        Car citroen = new Car("Citroen",140,4300);

        ford.start();
    }
}
