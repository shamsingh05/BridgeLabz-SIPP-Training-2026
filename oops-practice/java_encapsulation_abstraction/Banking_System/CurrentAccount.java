public class CurrentAccount
        extends BankAccount {

    private double monthlyBonusRate;

    public void setMonthlyBonusRate(
            double monthlyBonusRate) {

        this.monthlyBonusRate =
                monthlyBonusRate;
    }

    @Override
    public double calculateInterest() {

        return getBalance()
                * monthlyBonusRate / 100;
    }
}