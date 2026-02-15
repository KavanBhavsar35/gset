/**
 * A bank wants to offer a facility to calculate EMI (Equated Monthly Installment) for
 * different types of loans. Design a class LoanCalculator with the following overloaded
 * methods:
 * calculateEMI(int principal, int time, float rate): For home loans
 * calculateEMI(double principal, int time, double rate): For vehicle loans
 * calculateEMI(int principal, int time): For short-term personal loans with a fixed interest
 * rate of 10%
 * Demonstrate the use of all three methods in the main method by calculating EMIs for
 * different loan types
 */

class EMI {
    public static void calculateEMI(int principal, int time, float rate) {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI for Home Loan: " + emi + "\n");
    }

    public static void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI for Vehicle Loan: " + emi + "\n");
    }

    public static void calculateEMI(int principal, int time) {
        float fixedRate = 10.0f;
        double monthlyRate = fixedRate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI for Personal Loan: " + emi + "\n");
    }
}

public class Prac2_8 {
    public static void main(String[] args) {
        EMI.calculateEMI(500000, 60, 7.5f); // Home Loan
        EMI.calculateEMI(300000, 48, 9.0);   // Vehicle Loan
        EMI.calculateEMI(100000, 24);         // Personal Loan
    }
}




/*
OUTPUT:
EMI for Home Loan: 10018.974324365594  
EMI for Vehicle Loan: 7465.51271218021  
EMI for Personal Loan: 4614.4926578233 
*/
