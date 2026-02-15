/**
 * Create a Java class named University with a static data member totalStudents to keep track
 * of the number of student objects created. Implement a static method getTotalStudents().
 * Also, include a static block to initialize a static variable (e.g., universityName) and an
 * instance block to print a message when an object is created. Demonstrate their execution
 * order.
 */
public class Prac3_1 {
    public static void main(String[] args) {
        System.out.println("Total students before creating any objects: " + University.getTotalStudents());
        University student1 = new University();
        University student2 = new University();
        University student3 = new University();
        System.out.println("Total students after creating 3 objects: " + University.getTotalStudents());
    }
}

class University {
    private static int totalStudents;
    private static String universityName;

    static {
        universityName = "Global University";
        System.out.println("Static block executed: University name set to " + universityName);
    }

    {
        System.out.println("Instance block executed: A new student object is being created.");
    }

    public University() {
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}



/*
OUTPUT:
Static block executed: University name set to Global University 
Total students before creating any objects: 0 
Instance block executed: A new student object is being created. 
Instance block executed: A new student object is being created. 
Instance block executed: A new student object is being created. 
Total students after creating 3 objects: 3
*/
