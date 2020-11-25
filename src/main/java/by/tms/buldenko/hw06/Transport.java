package by.tms.buldenko.hw06;

public class Transport {
    protected int power = 1000;
    int maxSpeed;
    int weight;
    String brand;

    protected double getkW(){
        return power * 0.74;
    }


        // принимаем расход равным 10 литров на 100 км


    @Override
    public String toString() {
        return  "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", ";
    }
}
