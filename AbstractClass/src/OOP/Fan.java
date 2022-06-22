package OOP;

public class Fan {

    private final int Slow = 1;
    private final int Medium = 2;
    private final int Fast = 3;
    private int speed = Slow;
    private boolean On;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (On == true) {
            return (speed + " " + color + " " + radius + " Fan is on ");
        } else {
            return (color + " " + radius + " Fan is off ");
        }
    }

    public Fan(int radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.On = on;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10, "yellow", true);
        fan1.setSpeed(fan1.getFast());
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(5, "blue", false);
        fan2.setSpeed(fan2.getMedium());
        System.out.println(fan2.toString());
    }
}
