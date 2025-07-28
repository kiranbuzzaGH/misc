// Prints a checkerboard to the terminal

public class Checkerboard {
    public static void main(String[] args) {
        int rows = 4;

        while (rows > 0) {
            int columns = 8;

            while (columns > 0) {
                System.out.print("*");
                System.out.print(" ");
                columns--;
            }
            System.out.println();
            columns = 8;

            while (columns > 0) {
                System.out.print(" ");
                System.out.print("*");
                columns--;
            }
            System.out.println();
            rows--;
        }
    }
}
