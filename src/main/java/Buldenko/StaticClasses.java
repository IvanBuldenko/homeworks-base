package Buldenko;

public class StaticClasses {
    public static int number;
    private int anotherNumber;

    public int getNumber() {
        return number;
    }

    public void setStaticNumber(int number) {
        StaticClasses.number = number;
    }

    public int getAnotherNumber() {
        return anotherNumber;
    }

    public void setNonStaticNumber(int anotherNumber) {
        this.anotherNumber = anotherNumber;
    }
}
