// Estimate the value of e^x for some x.

import java.util.Scanner;

public class ExponentialEstimate {
    public static void main(String[] args) {

        double x = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate: ");
        int numTerms = input.nextInt();

        input.close();

        double counter = 1;
        double e = 1;
        double numerator = 1;

        while (counter < numTerms) {
            double fact = 1;
            double counter_temp = counter;

            while (counter_temp > 0) {
                fact *= counter_temp--;
            }

            numerator *= x;

            e += numerator / fact;
            counter++;
        }

        System.out.printf("The estimated value for e to the power of %f is: %f%n", x, e);
    }
}
