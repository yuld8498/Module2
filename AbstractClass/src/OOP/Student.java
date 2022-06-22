package OOP;

public class Student {
    private String name;
    private int age;
    private boolean gender;
    private String ID;
    /*
     * 1.phân biệt biến và thuộc tính của lớp
     * this.name: là thuộc tính của lớp
     * String name: là tham số của lớp student.
     * */
    public void Student(String name, int age, boolean gender, String ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID=ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("harry");
        System.out.println(student.getName());
    }
}
