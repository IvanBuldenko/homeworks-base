package by.tms.buldenko.hw07.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {

    }

    @Override
    public int getPrice() {
        return 0;
    }
}
