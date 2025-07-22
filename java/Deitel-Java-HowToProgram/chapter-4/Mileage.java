// Calculate mileage for most recent and all trips.

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles = 0;
        int gallons = 0;
        double milesPerGallon = 0;
        double totalMilesPerGallon = 0;

        System.out.print("Enter the number of miles driven for last trip (enter -1 to end): ");
        int currentMiles = input.nextInt();
        System.out.print("Enter the number of gallons used for last trip: ");
        int currentGallons = input.nextInt();

        while (currentMiles != -1) {
            if (currentGallons != 0) {
                milesPerGallon = (double) currentMiles / currentGallons;
            }
            else {
                System.out.println("Invalid number of gallons");
            }

            miles += currentMiles;
            gallons += currentGallons;

            if (gallons != 0) {
                totalMilesPerGallon = (double) miles / gallons;
            }
            else {
                System.out.println("Invalid number of gallons");
            }

            System.out.printf("This trip: %f miles per gallon %nTotal: %f miles per gallon%n",
                milesPerGallon, totalMilesPerGallon);

            System.out.print("Enter the number of miles driven for last trip (enter -1 to end): ");
            currentMiles = input.nextInt();
            System.out.print("Enter the number of gallons used for last trip: ");
            currentGallons = input.nextInt();
        }

        input.close();
    }
}
