package by.tms.buldenko.hw07;

import by.tms.buldenko.hw07.hands.IHand;
import by.tms.buldenko.hw07.hands.SamsungHand;
import by.tms.buldenko.hw07.hands.SonyHand;
import by.tms.buldenko.hw07.hands.ToshibaHand;
import by.tms.buldenko.hw07.heads.IHead;
import by.tms.buldenko.hw07.heads.SamsungHead;
import by.tms.buldenko.hw07.heads.SonyHead;
import by.tms.buldenko.hw07.heads.ToshibaHead;
import by.tms.buldenko.hw07.legs.ILeg;
import by.tms.buldenko.hw07.legs.SamsungLeg;
import by.tms.buldenko.hw07.legs.SonyLeg;
import by.tms.buldenko.hw07.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {


        IHead head;
        SamsungHead samsungHead = new SamsungHead();
        SonyHead sonyHead = new SonyHead();
        ToshibaHead toshibaHead = new ToshibaHead();

        IHand hand;
        SamsungHand samsungHand = new SamsungHand();
        SonyHand sonyHand = new SonyHand();
        ToshibaHand toshibaHand = new ToshibaHand();

        ILeg leg;
        SamsungLeg samsungLeg = new SamsungLeg();
        SonyLeg sonyLeg = new SonyLeg();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        Robot walle = new Robot(sonyHead, sonyHand, sonyLeg);
        walle.setName("Walle");

        Robot bender = new Robot();
        bender.setHead(samsungHead);
        bender.setHand(samsungHand);
        bender.setLeg(samsungLeg);
        bender.setName("Bender");

        head = toshibaHead;
        hand = toshibaHand;
        leg = sonyLeg;

        Robot robocop = new Robot(head, hand, leg);
        robocop.setName("Robocop");

        Robot bolt = new Robot(head, hand, leg);
        bolt.setName("Bolt");

        Robot aido = new Robot(head, hand, leg);
        aido.setName("Aido");


        walle.action();
        bender.action();
        robocop.action();
        bolt.action();
        aido.action();

        System.out.println("");

        System.out.println("");

        System.out.println(walle);
        System.out.println(bender);
        System.out.println(robocop);
        System.out.println(bolt);
        System.out.println(aido);

        Robot robots[] = {
                walle,
                bender,
                robocop,
                bolt,
                aido
        };
        int i;
        int maxPriceRobotIndex = 0;
        int maxPrice = 0;

        for (i = 0; i < robots.length; i++) {
            if (robots[i].getPrice() > maxPrice) {
                maxPrice = robots[i].getPrice();
                maxPriceRobotIndex = i;
            }
        }
        System.out.println("Максимальная цена у робота " + robots[maxPriceRobotIndex].getName() + " и равна " + maxPrice);







        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}

