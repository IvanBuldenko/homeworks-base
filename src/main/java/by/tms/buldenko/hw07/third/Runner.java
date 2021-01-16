package by.tms.buldenko.hw07.third;

public class Runner {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        cosmodrome.start(shuttle);
    }
}
