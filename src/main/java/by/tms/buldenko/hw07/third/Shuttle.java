package by.tms.buldenko.hw07.third;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if (randomNumber > 7) {
            System.out.println("Предстартовая проверка провалена");
            return false;
        } else {
            return true;
        }
    }
    @Override
    public void engineStart() {
        int i;
        System.out.println("Обратный отчет начался: ");
        for (i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void takeOff() {
        System.out.println("Полетели !!!!");
    }
}