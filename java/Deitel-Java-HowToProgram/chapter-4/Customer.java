// Determines whether account exceeds credit limit

public class Customer {
    private int accountNumber;
    private int beginningBalance;
    private int charges;
    private int credits;
    private int limit;

    public Customer(int accountNumber, int beginningBalance, int charges, int credits, int limit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.charges = charges;
        this.credits = credits;
        this.limit = limit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBeginningBalance() {
        return beginningBalance;
    }
    public int getCharges() {
        return charges;
    }
    public int getCredits() {
        return credits;
    }
    public int getLimit() {
        return limit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }
    public void setCharges(int charges) {
        this.charges = charges;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int endingBalance() {
        int endingBalance = beginningBalance + charges - credits;
        System.out.printf("New balance: %d%n", endingBalance);
        return endingBalance;
    }

    public void limitCheck() {
        if (this.endingBalance() > limit) {
            System.out.println("Credit limit exceeded");
        }
    }
}

