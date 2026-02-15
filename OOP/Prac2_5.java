/**
 * Define a Java class named Rectangle. It should have two double data fields:
 * width and height. In your main method, create two Rectangle objects: one with
 * width 4
 * and height 40, and another with width 3.5 and height 35.9. For each
 * rectangle, display its
 * width, height,
 * calculated area, and perimeter. Then, compare the two rectangles based on
 * their areas and
 * print which one has a larger area
 */

public class Prac2_5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("\nComparison:");
        if (r1.area() > r2.area()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.area() < r2.area()) {
            System.out.println("Rectangle 2 has a larger area.");
        }
    }

}

class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }
}



/*
OUTPUT:
Rectangle 1: 
Width: 4.0 
Height: 40.0 
Area: 160.0 
Perimeter: 88.0  

Rectangle 2: 
Width: 3.5 
Height: 35.9 
Area: 125.64999999999999 
Perimeter: 78.8  

Comparison: 
Rectangle 1 has a larger area.
*/
