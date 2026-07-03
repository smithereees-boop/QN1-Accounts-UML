public class CurrentAccount extends Account {
    private double overdraft;

    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount) {
        // Allows negative balance up to the overdraft limit
        // (e.g., if balance 100, overdraft 200, can withdraw up to 300)
        if (balance - amount >= -overdraft) {
            balance -= amount;
            return true;
        }
        return false;
    }
}