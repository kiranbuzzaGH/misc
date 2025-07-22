// Class containing various attributes related to heart rates

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dateOfBirthDay;
    private int dateOfBirthMonth;
    private int dateOfBirthYear;

    public HeartRates(String firstName, String lastName, int dateOfBirthDay,
                      int dateOfBirthMonth, int dateOfBirthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthDay = dateOfBirthDay;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.dateOfBirthYear = dateOfBirthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public int getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public int getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirthDay(int dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public void setDateOfBirthMonth(int dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public void setDateOfBirthYear(int dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }

    // Hardcoding this is bad design
    public int calculateAge() {
        int dayDiff = 18 - dateOfBirthDay;
        int monthDiff = 18 - dateOfBirthMonth;
        if (dayDiff < 0) {
            monthDiff = monthDiff - 1;
        }

        int yearDiff = 2025 - dateOfBirthYear;
        if (monthDiff < 0) {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    public int calculateMaximumHeartRate() {
        int maximumHeartRate = 220 - this.calculateAge();
        return maximumHeartRate;
    }

    public int calculateTargetHeartRate() {
        int targetHeartRate = this.calculateMaximumHeartRate() / 2;
        return targetHeartRate;
    }
}
