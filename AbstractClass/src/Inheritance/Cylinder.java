package Inheritance;

public class Cylinder extends  Circle{
    double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolumetric(){
        double Vol = getArea()*height;
        return Vol;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("blue");
    }
}
