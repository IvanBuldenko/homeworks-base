package by.tms.buldenko.hw07.third;

public class Cosmodrome {

    public void start(IStart start) {
        if (start.prelaunchSystemCheck()) {
            start.engineStart();
            start.takeOff();
        }
    }
}
