// Determines the total tax for a citizen

public class Citizen {
    private String name;
    private double earnings;

    public Citizen(String name, double earnings) {
        this.name = name;
        this.earnings = earnings;
    }

    public void calculateTax() {
        int BOUNDARY = 30000;
        double tax = 0;

        if (earnings <= BOUNDARY) {
            tax = earnings * 0.15;
        }
        else {
            tax = BOUNDARY * 0.15 + (earnings - BOUNDARY) * 0.2;
        }

        System.out.printf("%s's tax: %.2f%n", name, tax);
    }
}
