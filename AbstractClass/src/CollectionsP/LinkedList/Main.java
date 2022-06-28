package CollectionsP.LinkedList;

import CollectionsP.MyLinkList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new MyLinkedList();
        doubleLinkedList.add("ahihi");
        doubleLinkedList.add("hihi");
        doubleLinkedList.addFirst("first");
        doubleLinkedList.addLast("last");
        System.out.println(doubleLinkedList.toString());
        System.out.println(doubleLinkedList.contains("ahihi"));
        System.out.println(doubleLinkedList.indexOf("last"));
        doubleLinkedList.remove(2);
        System.out.println(doubleLinkedList.toString());
    }
}
