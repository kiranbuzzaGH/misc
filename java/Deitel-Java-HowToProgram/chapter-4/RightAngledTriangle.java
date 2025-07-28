// Prints a right angled triangle of asterisks

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a base length between 1 and 10: ");
        int length = input.nextInt();

        input.close();

        if (length > 0 && length < 11) {
            printTriangle(length);
        }
        else {
            System.out.println("Invalid length.");
        }
    }

    public static void printTriangle(int length) {
        int height = 1;

        while (height <= length) {
            int base = 1;

            while (base <= height) {
                System.out.print('*');
                base++;
            }
            System.out.println();
            height++;
        }
    }
}
