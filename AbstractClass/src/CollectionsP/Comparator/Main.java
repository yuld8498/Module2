package CollectionsP.Comparator;

import OOP.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//với comparator thì phải dùng Collections.sort(list, comparator) để overwrite COMPARE
//không cần implement comparator ở class khai báo.

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(15, "thanh", 151, "C042i1"));
        students.add(new Student(20, "phap", 24, "C0422i2"));
        students.add(new Student(18, "trung", 36, "D0200i2"));
        students.add(new Student(17, "thien", 14, "E0322i1"));
        System.out.println("before: ");
        for (Student s : students) {
            System.out.println(s.getAge() + " " + s.getName());
        }
        System.out.println("after: ");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Student s : students){
            System.out.println(s.toString());

        }
        System.out.println("\n");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        );
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
