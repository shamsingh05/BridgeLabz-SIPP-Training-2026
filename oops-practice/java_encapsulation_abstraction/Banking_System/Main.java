public class Main {

    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount();

        sa.setAccountNumber("SA101");
        sa.setHolderName("Bittu");
        sa.setBalance(50000);
        sa.setInterestRate(5);

        sa.deposit(5000);
        sa.withdraw(2000);

        sa.displayAccountDetails();

        System.out.println(
                "Interest : "
                        + sa.calculateInterest());

        System.out.println();

        CurrentAccount ca =
                new CurrentAccount();

        ca.setAccountNumber("CA101");
        ca.setHolderName("Ayush");
        ca.setBalance(80000);
        ca.setMonthlyBonusRate(2);

        ca.displayAccountDetails();

        System.out.println(
                "Interest : "
                        + ca.calculateInterest());
    }
}