package CollectionsP.LinkedList;

public interface DoubleLinkedList<T> extends Iterable {
    void clear();

    int size();

    boolean isEmpty();

    void add(T element);

    void addFirst(T element);

    void addLast(T element);

    T peekFirst();

    T peekLast();

    T removeFirst();

    T removeLast();

    T remove(Node<T> node);

    T remove(Object object);

    T remove(int index);

    int indexOf(Object object);

    boolean contains(Object object);
}
