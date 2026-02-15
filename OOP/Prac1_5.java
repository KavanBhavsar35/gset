/**
 * Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787),
 * calculate and display the minimum number of currency notes of denominations 100, 50, 10,
 * 5, 2, and 1 that would be given to the user.
 */

import java.util.Scanner;

public class Prac1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be dispensed: ");
        int amount = sc.nextInt();

        int[] denominations = {100, 50, 10, 5, 2, 1};
        int[] notes = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("The minimum number of currency notes are:");
        for (int i = 0; i < denominations.length; i++) {
            if (notes[i] > 0) {
                System.out.println(denominations[i] + " : " + notes[i]);
            }
        }
    }
}




/*
OUTPUT:
Enter the amount to be dispensed: The minimum number of currency notes are: 100 : 12 50 : 1 10 : 2 2 : 1 1 : 1
*/
