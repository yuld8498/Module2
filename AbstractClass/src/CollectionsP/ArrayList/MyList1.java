package CollectionsP.ArrayList;

import CollectionsP.MyList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList1<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList1(int capacity) {
        elements = new Object[capacity];
    }

    public int Size() {
        return size;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int indexOf(E object) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == object) {
                return i;
            }
        }
        return -1;
    }

    public boolean container(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void add(Integer index, E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        if (index < size) {

            for (int i = size++; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
        } else {
            elements[size++] = e;
        }
    }

    public E remove(int index) {
        if (index < size) {
            int j = 0;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    continue;
                } else {
                    elements[j] = elements[i];
                    j++;
                }
            }
            --size;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }
}
