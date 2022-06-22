package Inheritance;

public class PrimeCircle extends  Shape{
    double radius;
    public double getArea( double radius){
        this.radius =radius;
        return radius * Math.PI*2;
    }
    public double getPerimetter(double radius){
        this.radius = radius;
        return  radius*radius*Math.PI;
    }
    public String toString(){
        return "A Circle with radius = " + radius + ", which is a subclass of" + super.toString();
    }
}
