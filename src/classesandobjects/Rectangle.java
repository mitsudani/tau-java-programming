package classesandobjects;

public class Rectangle {

    // Fields
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor
    public Rectangle(double length, double width) {
        // Can be set in these two ways:
        this.length = length;
        setWidth(width);
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setters
    public void setLength(double length) {
        // "this" references the field, not the parameter
        this.length = length;
    }

    public void setWidth(double width) {
        // "this" refers to the class, in this case the field width, not the parameter
        // Without "this" there's a scope problem because the name is the same
        this.width = width;
    }

    // Methods
    public double calculatePerimeter() {
        return (length * 2) + (width * 2);
    }

    public double calculateArea() {
        return length * width;
    }
}
