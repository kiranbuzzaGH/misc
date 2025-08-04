// Estimate the value of constant e with a user defined number of terms.

import java.util.Scanner;

public class ConstantEstimate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate: ");
        int numTerms = input.nextInt();

        input.close();

        double counter = 1;
        double e = 1;

        while (counter < numTerms) {
            double fact = 1;
            double counter_temp = counter;

            while (counter_temp > 0) {
                fact *= counter_temp--;
            }

            e += 1 / fact;
            counter++;
        }

        System.out.printf("The estimated value for e is: %f%n", e);
    }
}
