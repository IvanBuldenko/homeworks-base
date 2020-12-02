package by.tms.buldenko.hw07.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

