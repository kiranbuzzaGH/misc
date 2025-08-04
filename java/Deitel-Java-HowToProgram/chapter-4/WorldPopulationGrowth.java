// Calculates the world population growth for each year in the subsequent 75 years

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double growthRate = 1.01;
        double populationMillions = 8005;

        int counter = 0;

        while (counter < 75) {
            int year = counter++ + 2025;
            double numIncreasePop = populationMillions * (growthRate - 1);
            populationMillions *= 1.01;

            System.out.printf("%6d %6f %f%n", year, populationMillions, numIncreasePop);
        }
    }
}
