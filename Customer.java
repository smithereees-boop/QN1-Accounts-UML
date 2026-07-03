import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Adds an account to the customer's list
    public void addAccount(Account a) {
        this.accounts.add(a);
    }

    // Calculates total worth by summing balances of all accounts
    public double totalWorth() {
        double total = 0.0;
        for (Account a : accounts) {
            total += a.getBalance();
        }
        return total;
    }
}