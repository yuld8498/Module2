package DSAStackQueue.Jame.Jame1;

public class GenericStackCilent {
    public static void StackOfString() {
        MyGenericStack<String> stackOfString = new MyGenericStack<>();
        stackOfString.push("hello");
        stackOfString.push("World");
        stackOfString.push("My");
        stackOfString.push("Name");
        stackOfString.push("is");
        stackOfString.push("Thanh");
        while (!stackOfString.isEmpty()){
            System.out.println(stackOfString.pop());
        }
    }
    public static void StackOfInteger() {
        MyGenericStack<Integer> stackOfInteger = new MyGenericStack<>();
        stackOfInteger.push(1);
        stackOfInteger.push(2);
        stackOfInteger.push(3);
        stackOfInteger.push(4);
        stackOfInteger.push(5);
        stackOfInteger.push(6);
        while (!stackOfInteger.isEmpty()){
            System.out.println(stackOfInteger.pop());
        }
    }

    public static void main(String[] args) {
        StackOfString();
        StackOfInteger();
    }
}
