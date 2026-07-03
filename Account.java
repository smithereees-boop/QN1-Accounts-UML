public abstract class Account implements Statement {
    protected String accountNo;
    protected double balance;

    // Constructor
    public Account(String accountNo, double opening) {
        this.accountNo = accountNo;
        this.balance = opening;
    }

    // Public methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    // {abstract} method
    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String generateStatement() {
        return "Account Number: " + this.accountNo + 
               " | Current Balance: UGX " + String.format("%.2f", this.balance);
    }
}
