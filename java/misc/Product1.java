// Program that takes as input three integers and calculates their product.

import java.util.Scanner;

public class Product1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int x = input.nextInt();

        System.out.print("Enter the second integer: ");
        int y = input.nextInt();

        System.out.print("Enter the third integer: ");
        int z = input.nextInt();

        int result = x * y * z;

        System.out.printf("Product is %d%n", result);
    }
}
