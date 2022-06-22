package Inheritance;

public class Circle {
    private double radius;
    private String color;
    private double Area;

    public double getArea() {
        return Area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Radius of Circle is: " + radius + ". Area of Circle is: " + Area;
    }
}
