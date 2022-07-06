package CollectionsP.ArrayList;

import java.util.ArrayList;

public class TestMyList1 {
    public static void main(String[] args) {
        MyList1<Integer> myList1 = new MyList1<Integer>();
        myList1.add(1,1);
        myList1.add(2,2);
        myList1.add(3,3);
        myList1.add(4,4);
        myList1.add(5,5);
        myList1.add(6,6);
        myList1.add(7,7);
        myList1.add(8,8);
        myList1.add(9,9);
        myList1.add(10,10);
        myList1.add(4,200);
        myList1.add(11,11);
        myList1.add(3,100);


        System.out.println(myList1.get(0));
        System.out.println(myList1.get(1));
        System.out.println(myList1.get(2));
        System.out.println(myList1.get(3));
        System.out.println(myList1.get(4));
        System.out.println(myList1.get(5));
        System.out.println(myList1.get(6));
        System.out.println(myList1.get(7));
        System.out.println(myList1.get(8));
        System.out.println(myList1.get(9));
        System.out.println(myList1.get(10));
        System.out.println(myList1.get(11));
        System.out.println(myList1.get(12));
        System.out.println(myList1.container(200));
        System.out.println(myList1.Size());
        System.out.println(myList1.container(22));
        Integer a = 128;
        Integer b =128;
        String c = "C";
        String e = "C";
        String d = new String("C");
        System.out.println(c==e);
        System.out.println(a==b);
    }
}
