// Print the largest and smallest of a set of 5 integers

import java.util.Scanner;

public class LargestSmallestInteger {
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

        int largest = integer1;
        int smallest = integer1;

        if (integer2 > largest) {
            largest = integer2;
        }
        if (integer2 < smallest) {
            smallest = integer2;
        }

        if (integer3 > largest) {
            largest = integer3;
        }
        if (integer3 < smallest) {
            smallest = integer3;
        }

        if (integer4 > largest) {
            largest = integer4;
        }
        if (integer4 < smallest) {
            smallest = integer4;
        }

        if (integer5 > largest) {
            largest = integer5;
        }
        if (integer5 < smallest) {
            smallest = integer5;
        }

        System.out.printf("Largest = %d%n", largest);
        System.out.printf("Smallest = %d%n", smallest);
    }
}
