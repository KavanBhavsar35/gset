/**
 * Write a Java program that demonstrates method overloading to calculate the volume of
 * different 3D shapes. Implement overloaded methods named calculateVolume() for a Cube
 * (takes one side length), a RectangularCube (takes length, width, height), and a Sphere (takes
 * radius)
 */


public class Prac3_5 {
    public static void main(String[] args) {
        System.out.println("Volume of Cube: " + calculateVolume(5));
        System.out.println("Volume of Rectangular Cube: " + calculateVolume(5, 4, 3));
        System.out.println("Volume of Sphere: " + calculateVolume(3));
    }

    public static double calculateVolume(double side) {
        return side * side * side;
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static float calculateVolume(float radius) {
        return (4.0f/3.0f) * (float)Math.PI * radius * radius * radius;
    }
}