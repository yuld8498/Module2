package ColorAble;

public class Square extends Shape implements Colorable {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getArea() {
        return size * size;
    }

    public double getPerimetter() {
        return size * 4;
    }

    public Square() {


    }

    public Square(int size) {
        this.size = size;
    }

    public Square(int size, String color, boolean filled) {
        super(color, filled);
        this.size = size;
    }

    @Override
    public String toString() {
        return getArea()+"\s"
                + " A square with size: "
                + getSize()
                + ", which is a subclass off"
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
