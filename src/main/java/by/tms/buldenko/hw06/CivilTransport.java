package by.tms.buldenko.hw06;

public class CivilTransport extends AirTranspoort {
    int passegers;
    boolean bussinesClass;
    int maxPassengers;

    @Override
    public String toString() {
        return "CivilTransport{" +
                super.toString() +
                "passagers=" + passegers +
                ", bussinesClass=" + bussinesClass +
                ", kW=" + getkW() +
                " }";
    }

    public void checkingNumberPassengers() {

        if (passegers <= maxPassengers) {
            System.out.println("Можно взлетать, всем хватает места!");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}