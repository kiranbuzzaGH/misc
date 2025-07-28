// Converts binary integers to decimal integers

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary integer: ");
        int binary = input.nextInt();

        input.close();

        int position = 1;
        int decimal = 0;

        while (binary > 0) {
            int digit = binary % 10;
            binary -= digit;
            binary /= 10;

            decimal += digit * position;

            position *= 2;
        }

        System.out.printf("Decimal representation: %d%n", decimal);
    }
}
