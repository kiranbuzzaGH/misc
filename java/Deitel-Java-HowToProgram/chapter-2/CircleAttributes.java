// Find the diameter, circumference and area of a circle of a given radius.

import java.util.Scanner;

public class CircleAttributes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

        input.close();

        System.out.printf("Diameter = %d%n", 2 * radius);
        System.out.printf("Circumference = %f%n", 2 * Math.PI * radius);
        System.out.printf("Area = %f%n", Math.PI * radius * radius);
    }
}
