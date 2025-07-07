// Determines whether an integer tripled is a multiple of another integer doubled

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int integer2 = input.nextInt();

        input.close();

        int tripled1 = integer1 * 3;
        int doubled2 = integer2 * 2;

        if (tripled1 % doubled2 == 0) {
            System.out.printf("%d tripled is a multiple of %d doubled%n", integer1, integer2);
        }
        if (tripled1 % doubled2 != 0) {
            System.out.printf("%d tripled is not a multiple of %d doubled%n", integer1, integer2);
        }

    }
}
