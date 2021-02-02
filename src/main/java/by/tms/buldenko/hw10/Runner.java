package by.tms.buldenko.hw10;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {

        FileReader fileIn = new FileReader("C:\\example.txt");
        FileWriter fileOut = new FileWriter("C:\\result.txt");

        try (BufferedReader br = new BufferedReader(fileIn);
        BufferedWriter bw = new BufferedWriter(fileOut)) {
            String s;
            while ((s = br.readLine()) != null) {

                if (Polindrones.isPalindrome(s)) {

                    bw.write(s);
                    bw.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}