/**
 * Write a program for billing system for a shopping mall. Create a class BillGenerator that
 * uses method overloading to generate bills based on customer type:
 * generateBill(int itemTotal): For regular customers, apply no discount.
 * generateBill(int itemTotal, int discount): For privileged customers, apply flat discount in
 * rupees.
 * generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage
 * discount.
 * Write a program to display the final bill amount using appropriate overloaded method based
 * on customer category.
 */

class BillGenerator {
    public static void generateBill(int itemTotal) {
        System.out.println("Total : " + itemTotal + "\n");
    }

    public static void generateBill(int itemTotal, int discount) {
        System.out.println("Total     : " + itemTotal);
        System.out.println("Discount  : " + discount);
        System.out.println("Final Amt : " + (itemTotal - discount)  + "\n");
    }

    public static void generateBill(int itemTotal, double discountPercent) {
        System.out.println("Total               : " + itemTotal);
        System.out.println("Discount (festive)  : " + discountPercent * itemTotal);
        System.out.println("Final Amt           : " + (itemTotal - (discountPercent*itemTotal))  + "\n");
    }
}

public class Prac2_7 {
    public static void main(String[] args) {
        BillGenerator.generateBill(100);
        BillGenerator.generateBill(100, 20);
        BillGenerator.generateBill(100, 0.10);
    }
}




/*
OUTPUT:
Total : 100  

Total     : 100 
Discount  : 20 
Final Amt : 80  

Total               : 100 
Discount (festive)  : 10.0 
Final Amt           : 90.0 
*/
