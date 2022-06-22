package Inheritance;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    public Point3D(float x,float y,float z){
        this.z =z;
        super.setXY(x,y);
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y, float z){
        super.setXY(x,y);
        this.z =z;
    }
    public float[] getXYZ(){
        float [] array = {getX(),getY(),z};
        return array;
    }
    public String toString(){
        return Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D= new Point3D(5.2f,8.98f,442.6f);
        System.out.println(point3D.toString());
    }
}
