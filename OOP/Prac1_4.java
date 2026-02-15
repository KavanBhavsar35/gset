/**
 * Develop a Java application that calculates a person's Body Mass Index (BMI). The program
 * should ask the user for their weight in pounds and height in inches. Convert these values to
 * kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and
 * then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI.
 */

import java.util.Scanner;

public class Prac1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weightInPounds = sc.nextFloat();
        System.out.print("Enter height in inches: ");
        float heightInInches = sc.nextFloat();

        float weightInKg = weightInPounds * 0.45359237f;
        float heightInMeters = heightInInches * 0.0254f;
        float bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.printf("The calculated BMI is: %.2f%n", bmi);
    }
}




/*
OUTPUT:
Enter weight in pounds: 185.188
Enter height in inches: 72
The calculated BMI is: 25.00
*/
