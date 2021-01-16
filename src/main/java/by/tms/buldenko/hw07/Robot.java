package by.tms.buldenko.hw07;

import by.tms.buldenko.hw07.hands.IHand;
import by.tms.buldenko.hw07.heads.IHead;
import by.tms.buldenko.hw07.legs.ILeg;

import java.util.Random;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private String name;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        System.out.println("У " + getName());
        head.speak();
        hand.upHand();
        leg.step();
        System.out.println("");
    }

    Random random = new Random();
    int randomNumber = random.nextInt(5);

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name=" + name +
                ", head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                '}';
    }
}
