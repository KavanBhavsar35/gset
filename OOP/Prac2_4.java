/**
 * Create a Point class representing a 2D point (x, y). Implement a default constructor that
 * initializes both x and y to 5. Provide a parameterized constructor to initialize x and y with
 * user-supplied values. Also, implement a copy constructor to create a new Point object as a
 * copy of an existing Point object. Include a display() method to show the point's coordinates
 * and write a main method to test all constructors and the display functionality.
 */

class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 5.0f;
        this.y = 5.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p1) {
        this.x = p1.x;
        this.y = p1.y;
    }

    public void display() {
        System.out.println("X: " + this.x + " Y: " + this.y);
    }
}

public class Prac2_4 {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        Point p2 = new Point(10.0f, 15.0f);
        System.out.println("Parameterized Constructor:");
        p2.display();

        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();
    }
}




/*
OUTPUT:
Default Constructor: X: 5.0 Y: 5.0 
Parameterized Constructor: X: 10.0 Y: 15.0 
Copy Constructor: X: 10.0 Y: 15.0
*/
