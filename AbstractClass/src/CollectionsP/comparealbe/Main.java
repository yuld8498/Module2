package CollectionsP.comparealbe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile(
                "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
        ArrayList<Person> person = new ArrayList<Person>();
        person.add(new Person(147, "Thanh", "M", 7600000));
        person.add(new Person(158, "Thien", "M", 7550000));
        person.add(new Person(149, "Phap", "W", 7530000));
        person.add(new Person(144, "Trung", "M", 7900000));
        person.add(new Person(146, "Vu", "W", 7505000));
        for (Person a : person) {
            System.out.println(a.toString());
        }
        System.out.println("\n");
        Collections.sort(person);
        for (Person a : person) {
            System.out.println(a.toString());
        }
    }
}
