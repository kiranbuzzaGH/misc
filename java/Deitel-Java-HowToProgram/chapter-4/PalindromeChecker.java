// Checks whether input integer is a pallindrome

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int integer = input.nextInt();

        while (integer < 10000 || integer > 99999) {
            System.out.println("Error: must enter a five-digit integer");
            System.out.print("Enter a five-digit integer: ");
            integer = input.nextInt();
        }

        input.close();

        int first = integer % 10;
        integer -= first;
        integer /= 10;
        int second = integer % 10;
        integer -= second;
        integer /= 10;
        int third = integer % 10;
        integer -= third;
        integer /= 10;
        int fourth = integer % 10;
        integer -= fourth;
        integer /= 10;
        int fifth = integer % 10;

        if (first == fifth && second == fourth) {
            System.out.println("Integer is a pallindrome");
        }
        else {
            System.out.println("Integer is not a pallindrome");
        }
    }
}
