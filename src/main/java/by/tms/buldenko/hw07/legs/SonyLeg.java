package by.tms.buldenko.hw07.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {

    }

    @Override
    public int getPrice() {
        return 0;
    }
}
