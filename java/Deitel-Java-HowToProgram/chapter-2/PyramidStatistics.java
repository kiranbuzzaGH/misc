// Estimates how much of the Pyramid of Giza was built each year, hour and minute.

public class PyramidStatistics {
    public static void main(String[] args) {
        int numberOfStones = 2300000;
        int averageWeightOfStone = 2268;
        int numberOfYears = 20;

        float rateYears = numberOfStones * averageWeightOfStone / numberOfYears;
        float rateHours = numberOfStones * averageWeightOfStone / (numberOfYears * 365 * 24);
        float rateMins = numberOfStones * averageWeightOfStone / (numberOfYears * 365 * 24 * 60);

        System.out.printf("%f %f %f%n", rateYears, rateHours, rateMins);

    }
}
