package Inheritance;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;
    protected Point2D(float x , float y){
        this.x = x ;
        this.y = y;
    }
    protected Point2D(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array = {x,y};
        return array;
    }
    public String toString(){
        return Arrays.toString(getXY());
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(5.6f,7.5f);
        System.out.println(point2D.toString());
    }
}
