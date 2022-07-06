package CollectionsP.Stack.DefaultLinked;

import org.w3c.dom.Node;

public class MyLinkedList<E> {
    Node head;
    int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, E element) {
        if (index > numNodes) {
            addLast(element);
        } else if (index == 0 || numNodes == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
        }
        numNodes++;

    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.getData().equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(element)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public E get(int i) {
        Node temp = head;
        if (i < 0 || i > numNodes) {
            throw new RuntimeException("index out of bound exception");
        }
        for (int j = 0; j < numNodes; j++) {
            if (j == i) {
                return (E) temp.getData();
            }
            temp = temp.next;
        }
        return null;
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void clear() {
        Node temp = head;
        while (temp != null) {
            temp.next = null;
            temp = temp.next;
        }
        head = null;
        numNodes = 0;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder = null;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = temp.next;
            numNodes--;
            return (E) temp.getData();
        }
        if (index == numNodes-1) {
            for (int i = 0; i < numNodes; i++) {
                holder = temp.next;
                temp =temp.next;
//                temp.next = null;
            }
            numNodes--;
            return (E) holder.getData();
        }
        for (int i = 0; i < numNodes; i++) {
            if (i == index - 1) {
                holder = temp.next;
                temp.next = holder.next;
                numNodes--;
                return (E) holder.getData();
            }
            temp = temp.next;
        }
        return null;
    }
}
