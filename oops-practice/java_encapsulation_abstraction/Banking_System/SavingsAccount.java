public class SavingsAccount
        extends BankAccount {

    private double interestRate;

    public void setInterestRate(
            double interestRate) {

        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {

        return getBalance()
                * interestRate / 100;
    }
}