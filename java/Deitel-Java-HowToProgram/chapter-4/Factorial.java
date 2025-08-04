// Calculates the factorial of a non-negative integer.

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        int integer = n;

        if (n > 0) {
            while (n > 0) {
                result *= n--;
            }
            System.out.printf("The factorial %d! = %d.%n", integer, result);
        }
        else if (n == 0) {
            System.out.println("The factorial 0! = 1");
        }
    }
}
