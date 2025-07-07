// Print the number of negative, zero and positive values from a list of 5 numbers.

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int integer2 = input.nextInt();
        System.out.print("Enter an integer: ");
        int integer3 = input.nextInt();
        System.out.print("Enter an integer: ");
        int integer4 = input.nextInt();
        System.out.print("Enter an integer: ");
        int integer5 = input.nextInt();

        input.close();

        int NumberPositive = 0;
        int NumberZero = 0;
        int NumberNegative = 0;

        if (integer1 < 0) {
            NumberNegative = NumberNegative + 1;
        }
        if (integer1 == 0) {
            NumberZero = NumberZero + 1;
        }
        if (integer1 > 0) {
            NumberPositive = NumberPositive + 1;
        }
        if (integer2 < 0) {
            NumberNegative = NumberNegative + 1;
        }
        if (integer2 == 0) {
            NumberZero = NumberZero + 1;
        }
        if (integer2 > 0) {
            NumberPositive = NumberPositive + 1;
        }
        if (integer3 < 0) {
            NumberNegative = NumberNegative + 1;
        }
        if (integer3 == 0) {
            NumberZero = NumberZero + 1;
        }
        if (integer3 > 0) {
            NumberPositive = NumberPositive + 1;
        }
        if (integer4 < 0) {
            NumberNegative = NumberNegative + 1;
        }
        if (integer4 == 0) {
            NumberZero = NumberZero + 1;
        }
        if (integer4 > 0) {
            NumberPositive = NumberPositive + 1;
        }
        if (integer5 < 0) {
            NumberNegative = NumberNegative + 1;
        }
        if (integer5 == 0) {
            NumberZero = NumberZero + 1;
        }
        if (integer5 > 0) {
            NumberPositive = NumberPositive + 1;
        }

        System.out.printf("Number of Negatives input is %d%n", NumberNegative);
        System.out.printf("Number of Zeros input is %d%n", NumberZero);
        System.out.printf("Number of Positives input is %d%n", NumberPositive);

    }
}
