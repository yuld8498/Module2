package CollectionsP.Stack.DefaultLinked;

public class MyTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(6);
        list.addLast(13);
        list.add(1,7);
        list.add(2,8);
        list.add(3,9);
        list.add(4,10);
        list.add(5,11);
        list.add(6,12);
        list.add(1,0);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
        System.out.println(list.size());
        System.out.println("aaa");
        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
        System.out.println(list.size());
    }
}
