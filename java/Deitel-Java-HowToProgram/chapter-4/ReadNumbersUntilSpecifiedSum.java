// Read integer values until the sum of said integers equals or exceeds the first value

import java.util.Scanner;

public class ReadNumbersUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the specified sum (integer): ");
        int specifiedSum = input.nextInt();

        int sum = 0;
        while (sum < specifiedSum) {
            System.out.print("Enter an integer: ");
            sum += input.nextInt();
        }
        input.close();
        System.out.printf("%d%n", sum);

    }
}
