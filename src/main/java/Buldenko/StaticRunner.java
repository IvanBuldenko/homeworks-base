package Buldenko;

public class StaticRunner {
    public static void main(String[] args) {
        StaticClasses instance = new StaticClasses();
        StaticClasses secondInstance = new StaticClasses();

        StaticClasses.number = 3;
        instance.setStaticNumber(10);
        secondInstance.setStaticNumber(8);
        instance.setNonStaticNumber(5);
        secondInstance.setNonStaticNumber(7);

        System.out.println("instance.getNumber(): " + instance.getNumber());
        System.out.println("secondInstance.getNumber(): " + secondInstance.getNumber());


        System.out.println("instance.getAnotherNumber(): " + instance.getAnotherNumber());
        System.out.println("secondInstance.getAnotherNumber(): " + secondInstance.getAnotherNumber());
    }

    public static boolean forTest(){
        StaticClasses.number = 5;
        System.out.println(StaticClasses.number);
        return 5 > StaticClasses.number;
    }
}
