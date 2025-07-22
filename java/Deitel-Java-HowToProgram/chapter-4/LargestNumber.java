// Find the largest number out of a set of 10 integers.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 0;
        int number = 0;
        int largest = 0;
        Scanner input = new Scanner(System.in);

        while (counter < 10) {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            counter++;

            if (number > largest) {
                largest = number;
            }
        }

        input.close();

        System.out.printf("Largest number: %d%n", largest);
    }
}
