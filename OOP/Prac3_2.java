/**
 * Design a class BankAccount with account_holder_name and balance. Use a static variable
 * interest_rate (same for all accounts). Include methods to calculate and display the interest
 * earned. Update interest rate using a static method
 */

class BankAccount {
    private String accountHolderName;
    private double balance;
    private static double interestRate;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void calculateAndDisplayInterest() {
        double interestEarned = balance * (interestRate / 100);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + interestEarned);
    }
}
public class Prac3_2 {
    public static void main(String[] args) {
        BankAccount.setInterestRate(5.0);

        BankAccount account1 = new BankAccount("Alice", 10000);
        BankAccount account2 = new BankAccount("Bob", 20000);

        account1.calculateAndDisplayInterest();
        System.out.println();
        account2.calculateAndDisplayInterest();
    }
}




/*
OUTPUT:
Account Holder: Alice Balance: 10000.0 Interest Rate: 5.0% Interest Earned: 500.0  Account Holder: Bob Balance: 20000.0 Interest Rate: 5.0% Interest Earned: 1000.0
*/
