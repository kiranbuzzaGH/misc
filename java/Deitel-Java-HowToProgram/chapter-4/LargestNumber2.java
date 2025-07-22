// Find the 2 largest numbers out of a set of 10 integers.
import java.util.Scanner;

public class LargestNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int number = 0;
        int largest = 0;
        int penultimate = 0;

        Scanner input = new Scanner(System.in);

        while (counter < 10) {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            counter++;

            if (number > largest) {
                penultimate = largest;
                largest = number;
            }
            else if (number > penultimate) {
                penultimate = number;
            }
        }

        input.close();

        System.out.printf("Largest number: %d%nPenultimate number: %d%n",
            largest, penultimate);
    }
}
