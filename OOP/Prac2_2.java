/**
 *  Create an Employee class with private instance variables for employeeName (String) and
 * employeeSalary (double). Implement public methods readEmployeeData() (to take input
 * from the user) and displayEmployeeData() (to print the employee's name and salary).
 * Demonstrate object creation and method invocation in a main method.
 */

import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class Prac2_2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}




/*
OUTPUT:
Enter employee name: kavan
Enter employee salary: 20000
Employee Name: kavan 
Employee Salary: 20000.0
*/
