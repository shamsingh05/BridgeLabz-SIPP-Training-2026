public class BankAccount {
    // Private fields - data encapsulation
    private String accountNumber;
    private double balance;
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        setBalance(initialBalance); // Using setter for validation
        }
        // Public getter for accountNumber

        public String getAccountNumber() {
            return accountNumber;
        }
        // Public getter for balance
        public double getBalance() {
            return balance;
        }
        // Public setter for balance with validation
        public void setBalance(double balance) {
            if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
        }
        // Method to deposit money with encapsulation
        public void deposit(double amount) {
            if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        }
        // Method to withdraw money with encapsulation
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Invalid withdraw amount.");
            }
        }
        // Method to display account information

        public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }   
}