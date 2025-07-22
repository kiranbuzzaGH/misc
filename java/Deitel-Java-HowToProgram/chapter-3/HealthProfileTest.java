import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // This is bad user design
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your gender: ");
        String gender = input.nextLine();
        System.out.println("Enter your date of birth - day: ");
        int dateOfBirthDay = input.nextInt();
        System.out.println("Enter your date of birth - month: ");
        int dateOfBirthMonth = input.nextInt();
        System.out.println("Enter your date of birth - year: ");
        int dateOfBirthYear = input.nextInt();
        System.out.println("Enter your height in inches: ");
        double heightInches = input.nextDouble();
        System.out.println("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();


        input.close();

        HealthProfile person = new HealthProfile(firstName, lastName, gender, dateOfBirthDay,
                                           dateOfBirthMonth, dateOfBirthYear, heightInches, weightPounds);
        int age = person.calculateAge();
        int maximumHeartRate = person.calculateMaximumHeartRate();
        int targetHeartRate = person.calculateTargetHeartRate();
        double personBMI = person.calculateBMI();

        System.out.printf("Age: %d%nMaximum Heart Rate: %d%nTarget Heart Rate: %d%nBMI: %f%n",
                           age, maximumHeartRate, targetHeartRate, personBMI);

        System.out.println("BMI Category 	BMI Range");
        System.out.println("Underweight 	Below 18.5");
        System.out.println("Healthy 	18.5 – 24.9");
        System.out.println("Overweight 	25.0 – 29.9");
        System.out.println("Obesity 	30.0 or above");

    }
}
