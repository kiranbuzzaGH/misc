// Print the squares, sum of squares and the difference of squares of two integers

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int first = input.nextInt();

        System.out.print("Enter an integer: ");
        int second = input.nextInt();

        int firstSquared = first * first;
        int secondSquared = second * second;

        int sumOfSquares = firstSquared + secondSquared;
        int differenceOfSquares = firstSquared - secondSquared;

        System.out.printf("%d %d %d %d%n", firstSquared, secondSquared, sumOfSquares, differenceOfSquares);
        input.close();
    }
}
