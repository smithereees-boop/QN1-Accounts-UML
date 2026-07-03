public class BankSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("John Doe");
        
        // Create Accounts
        SavingsAccount savings = new SavingsAccount("SAV-001", 1000.0, 5.0);
        CurrentAccount current = new CurrentAccount("CUR-001", 500.0, 200.0);

        c1.addAccount(savings);
        c1.addAccount(current);

        //operations
        savings.deposit(200.0);
        current.withdraw(600.0); // Should succeed (500-600 = -100, within 200 overdraft)
        savings.addInterest();

        //output
        System.out.println("--- Bank Statement ---");
        System.out.println(savings.generateStatement());
        System.out.println(current.generateStatement());
        System.out.println("--- Customer Summary ---");
        System.out.println("Total worth of " + "John Doe" + " is: UGX " + c1.totalWorth());
    }
}
