// Creates instances of object car and manipulates them

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "2019", 15000);
        Car car2 = new Car("Skoda", "2011", 4000);

        System.out.printf("Car of model %s and year %s has price %f%n",
                          car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("Car of model %s and year %s has price %f%n",
                          car2.getModel(), car2.getYear(), car2.getPrice());

        double newPrice = car1.getPrice() * 0.95;
        car1.setPrice(newPrice);

        newPrice = car2.getPrice() * 0.93;
        car2.setPrice(newPrice);

        System.out.printf("Car of model %s and year %s has price %f%n",
                          car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("Car of model %s and year %s has price %f%n",
                          car2.getModel(), car2.getYear(), car2.getPrice());

    }
}
