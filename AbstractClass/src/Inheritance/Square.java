package Inheritance;

public class Square extends  Rectangle{
    private double size;

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double setHeight(double height) {
        return getSize();
    }

    @Override
    public double setWidht(double widht) {
        return getSize();
    }
    public String toString(){
        return "A Square with side = "+size+", which is a subclass of" +  super.toString();
    }
}
