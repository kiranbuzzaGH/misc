public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirthDay;
    private int dateOfBirthMonth;
    private int dateOfBirthYear;
    private double heightInches;
    private double weightPounds;

    public HealthProfile(String firstName, String lastName, String gender, int dateOfBirthDay,
                      int dateOfBirthMonth, int dateOfBirthYear, double heightInches, double weightPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirthDay = dateOfBirthDay;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.dateOfBirthYear = dateOfBirthYear;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
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

    public double getHeight() {
        return heightInches;
    }

    public double getWeight() {
        return weightPounds;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setHeight(double heightInches) {
        this.heightInches = heightInches;
    }

    public void setWeight(double weightPounds) {
        this.weightPounds = weightPounds;
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

    public double calculateBMI() {
        double personBMI = weightPounds * 703 / (heightInches * heightInches);
        return personBMI;
    }
}
