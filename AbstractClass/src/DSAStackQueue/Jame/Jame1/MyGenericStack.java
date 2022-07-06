package DSAStackQueue.Jame.Jame1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> Stack;

    public MyGenericStack() {
        Stack = new LinkedList<>();
    }

    public void push(T element) {
        Stack.addFirst(element);
    }

    public T pop() {
        if (Stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return Stack.removeFirst();
    }
    public int size(){
        return Stack.size();
    }
    public boolean isEmpty(){
        if (Stack.isEmpty()){
            return true;
        }return false;
    }
}
