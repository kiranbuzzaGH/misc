// Check if an integer is divisible by 3

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        input.close();

        int currentNumber = 3;

        if (integer % currentNumber == 0) {
            System.out.printf("%d is divisible by %d%n", integer, currentNumber);
        }
        if (integer % currentNumber != 0) {
            System.out.printf("%d is not divisible by %d%n", integer, currentNumber);
        }
    }
}
