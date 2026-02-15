/**
 * Write a Java program that accepts two numbers as command-line arguments. Convert these
 * arguments to appropriate numeric types (e.g., int or double), perform a simple calculation
 * (e.g., sum or product), and print the result to the console.
 */

public class Prac1_8 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two command-line arguments.");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

/*
CMD: java Prac1_8 10 20
OUTPUT:
Sum: 30.0
Product: 200.0

*/
