// Displays the sum, average, product, smallest and largest of three input numbers.

import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfIntegers = 3;

        System.out.print("Enter an integer: ");
        int integer1 = input.nextInt();

        System.out.print("Enter an integer: ");
        int integer2 = input.nextInt();

        System.out.print("Enter an integer: ");
        int integer3 = input.nextInt();

        int sum = integer1 + integer2 + integer3;
        int average = sum / numberOfIntegers;

        int largest = 0;
        int smallest = 0;


        // This is terrible design as many unnecessary checks are made.
        if (integer1 >= integer2 && integer1 >= integer3) {
            largest = integer1;
        }
        if (integer2 >= integer1 && integer2 >= integer3) {
            largest = integer2;
        }
        if (integer3 >= integer2 && integer3 >= integer1) {
            largest = integer3;
        }
        if (integer1 <= integer2 && integer1 <= integer3) {
            smallest = integer1;
        }
        if (integer2 <= integer1 && integer2 <= integer3) {
            smallest = integer1;
        }
        if (integer3 <= integer2 && integer3 <= integer1) {
            smallest = integer1;
        }

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Average = %d%n", average);
        System.out.printf("Largest = %d%n", largest);
        System.out.printf("Smallest = %d%n", smallest);
        input.close();
    }
}
