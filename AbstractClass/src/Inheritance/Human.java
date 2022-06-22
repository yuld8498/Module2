package Inheritance;

public class Human {
    private String name;
    private int age;
    String wellcome = "Wellcome";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Men extends Human {
    public void setName(String name) {
        System.out.println("My name is: " + name);
    }

    private boolean gender;

    public static void polymophism(Human humanObject) {
        System.out.println(humanObject + "hello");
        System.out.println(humanObject.toString());

    }

    public static void main(String[] args) {
        Men men = new Men();
        men.setAge(25);
        men.setName("Thanh");
        System.out.println(men.wellcome = "Hello everyone");
    }
}

