package source;

public class Cylinder {
    public static double getBaseArea(int radius){
        return Math.PI*radius*radius;
    }
    public static double getBasePerimeter(int radius){
        return  Math.PI*2*radius;
    }
    public static double getVolume(int radius, int height){
        return getBasePerimeter(radius)*height+2*getBaseArea(radius);
    }
}
