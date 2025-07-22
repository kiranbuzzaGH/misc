// Create and use citizen object.
import java.util.Scanner;

public class CitizenTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter citizen 1's name: ");
        String name1 = input.nextLine();
        System.out.print("Enter their earnings: ");
        double earnings1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter citizen 2's name: ");
        String name2 = input.nextLine();
        System.out.print("Enter their earnings: ");
        double earnings2 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter citizen 3's name: ");
        String name3 = input.nextLine();
        System.out.print("Enter their earnings: ");
        double earnings3 = input.nextDouble();


        input.close();

        Citizen citizen1 = new Citizen(name1, earnings1);
        Citizen citizen2 = new Citizen(name2, earnings2);
        Citizen citizen3 = new Citizen(name3, earnings3);


        citizen1.calculateTax();
        citizen2.calculateTax();
        citizen3.calculateTax();
    }
}
