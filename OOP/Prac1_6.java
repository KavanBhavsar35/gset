/**
 * Write a Java program that accepts a five-digit integer from the keyboard. Your program\
 * should then create a new number by adding one to each digit of the input number. For\
 * example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0\
 * with a carry)
 */

import java.util.Scanner;

public class Prac1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = sc.nextInt();

        int result = 0;
        int multiplier = 1;

        for (int i = 0; i < 5; i++) {
            int digit = number % 10;
            number /= 10;
            digit++;
            if (digit > 9) {
                digit = 0;
            }
            result += digit * multiplier;
            multiplier *= 10;
        }

        System.out.println("The new number is: " + result);
        
    }
}




/*
OUTPUT:
Enter a five-digit integer: 52314
The new number is: 63425
*/
