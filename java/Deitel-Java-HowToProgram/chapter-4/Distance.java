// Determines whether the line connecting two points is perpendicular to an axis.

public class Distance {
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 1;

        if ((x1 - x2) == 0 || (y1 - y2) == 0) {
            System.out.printf("Points (%d, %d) and (%d, %d) are located on a line perpendicular to an axis%n", x1, y1, x2, y2);
        }
        else{
            System.out.printf("Points (%d, %d) and (%d, %d) are not located on a line perpendicular to an axis%n", x1, y1, x2, y2);
        }
    }
}
