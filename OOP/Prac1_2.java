/**
 * Write a Java program to solve a system of two linear equations with two variables (e.g., a
 * + by = e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculat
 * and display the values of x and y using Cramer's rule. Include error handling for cases wher
 * the denominator is zero
 * Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D

 */

import java.util.Scanner;

public class Prac1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, c, d, e, f:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();

        float D = a * d - b * c;
        if (D == 0) {
            System.out.println("The system has no unique solution.");
            return;
        }

        float Dx = e * d - b * f;
        float Dy = a * f - e * c;

        float x = Dx / D;
        float y = Dy / D;

        System.out.printf("x = %.2f%n", x);
        System.out.printf("y = %.2f%n", y);
    }
}




/*
OUTPUT:

*/




/*
OUTPUT:
Enter coefficients a, b, c, d, e, f:
1 1 1 -1 5 1
x = 3.00 y = 2.00
*/
