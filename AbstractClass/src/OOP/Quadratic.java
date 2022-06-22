package OOP;

public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public double getRoot2() {
        return (b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic(1, 9, 7);
        if (quadratic.getDiscriminant() > 0) {
            System.out.printf("%s%.3f%s%.3f", " Phuong trinh co 2 nghiem la: ", quadratic.getRoot1(), "va ", quadratic.getRoot2());
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.printf("%s %.3f", "Phuong trinh co 1 nghiem la: ",quadratic.getRoot1());
        } else {
            System.out.println("phuong trinh vo nghiem;");
        }
    }
}
