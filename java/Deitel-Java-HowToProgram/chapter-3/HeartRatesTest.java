// Creates and manipulates a HeartRates object

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // This is bad user design
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your date of birth - day: ");
        int dateOfBirthDay = input.nextInt();
        System.out.println("Enter your date of birth - month: ");
        int dateOfBirthMonth = input.nextInt();
        System.out.println("Enter your date of birth - year: ");
        int dateOfBirthYear = input.nextInt();

        input.close();

        HeartRates person = new HeartRates(firstName, lastName, dateOfBirthDay,
                                           dateOfBirthMonth, dateOfBirthYear);
        int age = person.calculateAge();
        int maximumHeartRate = person.calculateMaximumHeartRate();
        int targetHeartRate = person.calculateTargetHeartRate();

        System.out.printf("Age: %d%nMaximum Heart Rate: %d%nTarget Heart Rate: %d%n",
                           age, maximumHeartRate, targetHeartRate);
    }
}
