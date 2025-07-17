// Creating and manipulating a PetrolPurchase object

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol1 = new PetrolPurchase("Cambridge", "Diesel", 10, 8, 5);

        System.out.println("Information about the petrol you purchase.");
        System.out.printf("Station's location: %s%n", petrol1.getStationLocation());
        System.out.printf("Petrol type: %s%n", petrol1.getPetrolType());
        System.out.printf("Quantity of the purchase in litres: %d%n", petrol1.getQuantityLitres());
        System.out.printf("Price per litre: %f%n", petrol1.getPricePerLitre());
        System.out.printf("Percentage discount: %f%n", petrol1.getPercentageDiscount());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the station's location: ");
        String stationLocation = input.nextLine();
        petrol1.setStationLocation(stationLocation);

        System.out.println("Enter the petrol type: ");
        String petrolType = input.nextLine();
        petrol1.setPetrolType(petrolType);

        System.out.println("Enter the quantity of the purchase in litres: ");
        int quantityLitres = input.nextInt();
        petrol1.setQuantityLitres(quantityLitres);

        System.out.println("Enter the price per litre: ");
        double pricePerLitre = input.nextDouble();
        petrol1.setPricePerLitre(pricePerLitre);

        System.out.println("Enter the percentage discount: ");
        double percentageDiscount = input.nextDouble();
        petrol1.setPercentageDiscount(percentageDiscount);

        System.out.println("Information about the petrol you purchase.");
        System.out.printf("Station's location: %s%n", petrol1.getStationLocation());
        System.out.printf("Petrol type: %s%n", petrol1.getPetrolType());
        System.out.printf("Quantity of the purchase in litres: %d%n", petrol1.getQuantityLitres());
        System.out.printf("Price per litre: %f%n", petrol1.getPricePerLitre());
        System.out.printf("Percentage discount: %f%n", petrol1.getPercentageDiscount());

        input.close();
    }
}
