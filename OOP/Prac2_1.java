/**
 * Define a Java class named Rectangle. It should have two float data fields: width and
 * height, both with a default value of 1. Implement a no-argument constructor and a
 * constructor that takes width and height as parameters. Include methods getArea() and
 * getPerimeter() that return the calculated area and perimeter respectively.
 */

class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
        this.width = 1.0f;
        this.height = 1.0f;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }
}

public class Prac2_1 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(5.0f, 3.0f);
        System.out.println("\nCustom Rectangle:");
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}



/*
OUTPUT:
Default Rectangle: Area: 1.0 Perimeter: 4.0  
Custom Rectangle: Area: 15.0 Perimeter: 16.0
*/
