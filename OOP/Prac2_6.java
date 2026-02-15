import java.util.Scanner;

/**
 * Create a class BankAccount with accountId (String), accountHolderName (String), and
 * balance (double) as instance variables. Include methods assignValues() (for initialization)
 * and displayValues(). Implement a search function that takes an accountId as input and, if
 * found within an array of BankAccount objects, displays the details of that specific account.
 * In your main method, create an array of at least five BankAccount objects and demonstrate
 * adding, displaying, and searching for accounts
 */

class BankAccount {
    private String accountId;
    private String accountHolderName;
    private double balance;

    public void assignValues(String accountId, String accountHolderName, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayValues() {
        System.out.println("Account ID: " + this.accountId);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    public static void search(BankAccount[] accounts, String accountId) {
        for (BankAccount account : accounts) {
            if (account.accountId.equals(accountId)) {
                System.out.println("Account found:");
                account.displayValues();
                return;
            }
        }
        System.out.println("Account with ID " + accountId + " not found.");
    }
}

public class Prac2_6 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < accounts.length; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");
            String accountId = "A00" + (i + 1);
            accounts[i] = new BankAccount();
            System.out.print("Enter account holder name: ");
            String accountHolderName = sc.nextLine();
            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            accounts[i].assignValues(accountId, accountHolderName, balance);
        }

        System.out.println("Displaying all accounts:");
        for (BankAccount account : accounts) {
            account.displayValues();
            System.out.println();
        }

        System.out.println("Searching for account with ID A003:");
        BankAccount.search(accounts, "A003");

        System.out.println("\nSearching for account with ID A006:");
        BankAccount.search(accounts, "A006");
    }
}




/*
OUTPUT:
Enter details for account 1: 
Enter account holder name: a
Enter balance: 1000
Enter details for account 2: 
Enter account holder name: b
Enter balance: 2000
Enter details for account 3: 
Enter account holder name: c
Enter balance: 2000
Enter details for account 4: 
Enter account holder name: d
Enter balance: 2500
Enter details for account 5: 
Enter account holder name: e
Enter balance: 1500

Displaying all accounts: 
Account ID: A001 Account Holder Name: a Balance: 1000.0  
Account ID: A002 Account Holder Name: b Balance: 2000.0  
Account ID: A003 Account Holder Name: c Balance: 2000.0  
Account ID: A004 Account Holder Name: d Balance: 2500.0  
Account ID: A005 Account Holder Name: e Balance: 1500.0 

Searching for account with ID A003: Account found: 
Account ID: A003 
Account Holder Name: c 
Balance: 2000.0  

Searching for account with ID A006: 
Account with ID A006 not found.
*/
