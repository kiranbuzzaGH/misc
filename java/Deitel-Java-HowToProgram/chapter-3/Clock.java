// Defines attributes and methods for Clock class

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 23) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if (second > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public void displayTime() {
        System.out.printf("Current time is: %02d:%02d:%02d%n", hour, minute, second);
    }
}
