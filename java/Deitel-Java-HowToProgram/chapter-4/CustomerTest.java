// Create and test a customer object.

public class CustomerTest {
    public static void main(String[] args) {
        int accountNumber1 = 1;
        int beginningBalance1 = 0;
        int charges1 = 150;
        int credits1 = 120;
        int limit1 = 10;

        Customer customer1 = new Customer(accountNumber1, beginningBalance1, charges1, credits1, limit1);

        customer1.limitCheck();
    }
}
