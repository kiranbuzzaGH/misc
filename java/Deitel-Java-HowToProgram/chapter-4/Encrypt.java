// Encrypt a 4 digit integer

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 4 digit integer: ");
        int integer = input.nextInt();
        input.close();

        int fourth = integer % 10;
        integer = (integer - fourth) / 10;
        int third = integer % 10;
        integer = (integer - third) / 10;
        int second = integer % 10;
        integer = (integer - second) / 10;
        int first = integer % 10;

        fourth = (fourth + 7) % 10;
        third = (third + 7) % 10;
        second = (second + 7) % 10;
        first = (first + 7) % 10;

        int encrypted = second + 10 * first + 100 * fourth + 1000 * third;

        System.out.printf("The encrrypted integer is %04d%n", encrypted);
    }
}
