package CollectionsP.Comparator;

import java.util.Comparator;

public class Student  {
    private int age;
    private String name;
    private int ID;
    private  String ofClass;

    public Student(int age, String name, int ID, String ofClass) {
        this.age = age;
        this.name = name;
        this.ID = ID;
        this.ofClass=ofClass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOfClass() {
        return ofClass;
    }

    public void setOfClass(String ofClass) {
        this.ofClass = ofClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name  +
                ", ID=" + ID +
                ", ofClass='" + ofClass +
                '}';
    }

}
