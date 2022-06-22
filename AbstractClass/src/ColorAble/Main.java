package ColorAble;

public class Main {

    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        shapes[0] = new Circle(6.2);
        shapes[1] = new Rectangle(5.4,7.2);
        shapes[2] = new Square(5,"blue", true);
        shapes[3] = new Square(6);
        for (Shape shape : shapes){
            System.out.println(shape.getArea());
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}
