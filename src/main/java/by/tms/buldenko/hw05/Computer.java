package by.tms.buldenko.hw05;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    static int cpu;
    static int ram;
    static int hardDisk;
    static int cycleLimit = 2;
    static boolean isBurnt;

    public static void main(String[] args) {
        for (; ; ) {
            displayInfo();
            switchPower("Компьютер включен");
            if (isBurnt) {
                break;
            }
            switchPower("Компьютер выключен");
            if (isBurnt) {
                break;
            }
            cycleLimit--;
            if (cycleLimit == 0) {
                System.out.println("Лимит операций исчерпан");
                break;
            }
        }
    }

    public static void displayInfo() {
        System.out.println("cpu: " + cpu + "\n" +
                "ram: " + ram + "\n" +
                "hardDisk: " + hardDisk + "\n" +
                "cycleLimit: " + cycleLimit + "\n");
    }

    public static void switchPower(String state) {
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println("Введите число от 0 до 1: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (i == s) {
            System.out.println(state);
        } else {
            System.out.println("Компьютер сгорел =(");
            isBurnt = true;
        }
    }
}