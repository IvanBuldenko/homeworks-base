package by.tms.buldenko.hw07.second;

public class IRun {
    public static void main(String[] args) {
        Jacket jacket = new Jacket();
        Pants pants = new Pants();
        Shoes shoes = new Shoes();
        Human ivan = new Human(jacket,pants,shoes);
        ivan.setName("Ivan");
        ivan.putOn();
        ivan.takeOff();
    }
}
