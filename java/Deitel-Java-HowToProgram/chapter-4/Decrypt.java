// Decode an integer encrypted by Encrypt.java

import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 4 digit encrypted integer: ");
        int integer = input.nextInt();
        input.close();

        int second = integer % 10;
        integer = (integer - second) / 10;
        int first = integer % 10;
        integer = (integer - first) / 10;
        int fourth = integer % 10;
        integer = (integer - fourth) / 10;
        int third = integer % 10;
        integer = (integer - third) / 10;



        fourth -= 7;
        third -= 7;
        second -= 7;
        first -= 7;

        if (fourth < 0) {
            fourth += 10;
        }
        if (third < 0) {
            third += 10;
        }
        if (second < 0) {
            second += 10;
        }
        if (first < 0) {
            first += 10;
        }

        int decrypted = fourth + 10 * third + 100 * second + 1000 * first;

        System.out.printf("The decrrypted integer is %04d%n", decrypted);
    }
}
