import java.lang.Math;

// Square class
class Square {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate area
    public double calculateArea() {
        return side * side;
    }
}

// Rectangle class
class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
}

// Triangle class
class Triangle {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Circle class
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class BasicShape {
    public static void main(String[] args) {
        // Creating instances of geometric shapes
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);
        Circle circle = new Circle(3);

        // Calculating and printing areas
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}

