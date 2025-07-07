// Displays whether an integer and its square are greater than, less than or equal to 100.

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        int square = integer * integer;
        int currentNumber = 100;

        // Note that this is terrible design with lots of redundant if statements
        if (integer == currentNumber) {
            System.err.printf("%d == %d%n", integer, currentNumber);
        }
        if (integer > currentNumber) {
            System.err.printf("%d > %d%n", integer, currentNumber);
        }
        if (integer < currentNumber) {
            System.err.printf("%d < %d%n", integer, currentNumber);
        }
        if (integer != currentNumber) {
            System.err.printf("%d != %d%n", integer, currentNumber);
        }
        if (square == currentNumber) {
            System.err.printf("%d == %d%n", square, currentNumber);
        }
        if (square > currentNumber) {
            System.err.printf("%d > %d%n", square, currentNumber);
        }
        if (square < currentNumber) {
            System.err.printf("%d < %d%n", square, currentNumber);
        }
        if (square != currentNumber) {
            System.err.printf("%d != %d%n", square, currentNumber);
        }

        input.close();
    }
}
