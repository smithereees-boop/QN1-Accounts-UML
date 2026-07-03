public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }

    @Override
    public boolean withdraw(double amount) {
        // Refuse withdrawal if it takes balance below zero
        if (balance - amount >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void addInterest() {
        // Adds rate% of the balance to the balance
        balance += (balance * (rate / 100));
    }
}