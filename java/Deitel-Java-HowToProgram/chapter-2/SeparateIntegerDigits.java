// Separates a 5 digit integer into separate digits

import java.util.Scanner;

public class SeparateIntegerDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 digit integer: ");
        int integer = input.nextInt();

        input.close();

        int first = integer / 10000;
        int second = (integer % 10000) / 1000;
        int third = (integer % 1000) / 100;
        int fourth = (integer % 100) / 10;
        int fifth = integer % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", first, second, third, fourth, fifth);
    }
}
