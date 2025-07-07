// BMI Calculator

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in Kilograms: ");
        int weightInKilograms = input.nextInt();
        System.out.print("Enter your height in Meters: ");
        int heightInMeters = input.nextInt();

        input.close();

        int BMI = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("User's BMI is %d%n", BMI);

        System.out.println("BMI Category 	BMI Range");
        System.out.println("Underweight 	Below 18.5");
        System.out.println("Healthy 	18.5 – 24.9");
        System.out.println("Overweight 	25.0 – 29.9");
        System.out.println("Obesity 	30.0 or above");
    }
}
