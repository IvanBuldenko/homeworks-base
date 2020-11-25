package by.tms.buldenko.hw06;

import java.util.Scanner;

public class TransportRunner {
    public static void main(String[] args) {
        Transport transport = new Transport();
        System.out.println("Transport " + transport);

        LightTransport car = new LightTransport();
        System.out.println(car);

        CivilTransport plane = new CivilTransport();
        System.out.println(plane);

        FreightTransport truck = new FreightTransport();
        System.out.println(truck);

        MilitaryTransport warPlane = new MilitaryTransport();
        System.out.println(warPlane);

        System.out.println("");

        car.brand = "Ford";
        car.maxSpeed = 100;
        truck.maxHeight = 1000;
        plane.maxPassengers = 10;
        warPlane.numberOfRockets = 3;
        warPlane.systemOfBailOut = true;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время движения машины:");
        int time = scanner.nextInt();

        System.out.println("За время " + time +
                " ч " + " автомобиль " + car.brand +
                " двигаясь с максимальной скоростью " + car.maxSpeed +
                " км/ч проедет " + car.kmForTime(time) +
                " и израсходует " + car.getFuelForTime(time) +
                " литров топлива."  );

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество груза, который нужно загрузить:");
        int weight = sc.nextInt();
        truck.CheckingMachineLoading(weight);

        System.out.println("");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите количество пассажиров:");
        plane.passegers = scanner1.nextInt();
        plane.checkingNumberPassengers();

        for (;;) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Для выстрела введите 1");
            int shoot = scanner2.nextInt();
            if (shoot == 1) {
                warPlane.numberOfRockets--;
            }
            if (warPlane.numberOfRockets==0) {
                System.out.println("Боеприпасы отсутствуют");
                break;
            }
            warPlane.shots();
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Для катапультирования введите 1");
        int bailOut = scanner3.nextInt();
        if (bailOut == 1) {
            warPlane.bailOut();
        }


    }
}
