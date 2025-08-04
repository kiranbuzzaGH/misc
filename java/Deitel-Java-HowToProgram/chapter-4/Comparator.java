// Reads two numbers and prints 0 if equal, 1 if the first is greater, -1 if the other is greater

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        input.close();

        if (num1 == num2) {
            System.out.println("0");
        }
        else if (num1 > num2) {
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }
}
