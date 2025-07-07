// Displays the estimated world population after one, two, three, four and five years.

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        int currentWorldPopulation = 8_061;
        int annualWorldPopulationGrowth = 73;

        int estimatedWorldPopulationAfter1 = currentWorldPopulation + annualWorldPopulationGrowth;
        int estimatedWorldPopulationAfter2 = currentWorldPopulation + annualWorldPopulationGrowth * 2;
        int estimatedWorldPopulationAfter3 = currentWorldPopulation + annualWorldPopulationGrowth * 3;
        int estimatedWorldPopulationAfter4 = currentWorldPopulation + annualWorldPopulationGrowth * 4;
        int estimatedWorldPopulationAfter5 = currentWorldPopulation + annualWorldPopulationGrowth * 5;

        System.out.printf("Estimated world population in millions after one, two, three, four and five years respectively is %d, %d, %d, %d, %d%n", estimatedWorldPopulationAfter1, estimatedWorldPopulationAfter2, estimatedWorldPopulationAfter3, estimatedWorldPopulationAfter4, estimatedWorldPopulationAfter5);
    }
}
