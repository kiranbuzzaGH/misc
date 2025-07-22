// Calculate and display salesperson's earnings given the items sold that week.

import java.util.Scanner;

public class SalesCommisionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many of item 1 did you sell? ");
        int item1 = input.nextInt();
        System.out.print("How many of item 2 did you sell? ");
        int item2 = input.nextInt();
        System.out.print("How many of item 3 did you sell? ");
        int item3 = input.nextInt();
        System.out.print("How many of item 4 did you sell? ");
        int item4 = input.nextInt();

        input.close();

        double sales = item1 * 239.99 + item2 * 129.75 + item3 * 99.95 + item4 * 350.89;
        double earnings = 200 + sales * 0.09;

        System.out.printf("Last week's earnings: %.2f%n", earnings);

    }
}
