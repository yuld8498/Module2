package Inheritance;

public class Rectangle extends Shape{
    private double widht;
    private double height;

    public double getWidht() {
        return widht;
    }

    public double setWidht(double widht) {
        this.widht = widht;
        return widht;
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(double height) {
        this.height = height;
        return height;
    }

    public double getArea(double width, double height){
        this.widht = width;
        this.height = height;
        return widht*height;
    }
    public double getPerimetter(double widht, double height){
        this.widht =widht;
        this.height = height;
        return (widht+height)*2;
    }
    public String toString(){
        return  "A Reactangle width width = "  +  widht + " and length = " + height + super.toString();
    }
}
