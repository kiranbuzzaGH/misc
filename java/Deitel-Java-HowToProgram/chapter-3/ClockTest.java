// Creates and manipulates an instance of clock

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock1 = new Clock(0, 0, 0);

        clock1.displayTime();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hour: ");
        int hour = input.nextInt();
        clock1.setHour(hour);

        System.out.println("Enter the minute: ");
        int minute = input.nextInt();
        clock1.setMinute(minute);

        System.out.println("Enter the second: ");
        int second = input.nextInt();
        clock1.setSecond(second);

        clock1.displayTime();

        input.close();
    }
}
