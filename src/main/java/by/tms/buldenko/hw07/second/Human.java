package by.tms.buldenko.hw07.second;

public class Human implements Clothes {
    private String name;
    private Clothes jacket;
    private Clothes pants;
    private Clothes shoes;

    public Human(Clothes jacket, Clothes pants, Clothes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getJacket() {
        return jacket;
    }

    public void setJacket(Clothes jacket) {
        this.jacket = jacket;
    }

    public Clothes getPants() {
        return pants;
    }

    public void setPants(Clothes pants) {
        this.pants = pants;
    }

    public Clothes getShoes() {
        return shoes;
    }

    public void setShoes(Clothes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
        System.out.println(name + " надел всю одежду");
        System.out.println("");
    }

    @Override
    public void takeOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
        System.out.println(name + " снял всю одежду");
        System.out.println("");
    }
}
