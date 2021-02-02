package by.tms.buldenko.hw10;

public class Polindrones {
    public static boolean isPalindrome (String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString().equals(input));
    }
}


