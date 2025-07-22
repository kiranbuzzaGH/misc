// Print integers with corresponding squares, cubes and integers to the power of 4.

public class TabularOutput {
    public static void main(String[] args) {
        int lastN = 6;
        int n = 1;

        System.out.printf("%4s %4s %4s %4s%n", "N", "N^2", "N^3", "N^4");

        while (n < lastN) {
            System.out.printf("%4d %4d %4d %4d%n", n, n*n, n*n*n, n*n*n*n);
            n++;
        }
    }
}
