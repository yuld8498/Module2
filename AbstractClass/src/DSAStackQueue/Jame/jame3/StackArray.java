package DSAStackQueue.Jame.jame3;

import java.util.Scanner;
import java.util.Stack;

public class StackArray<E> {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int[] Array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter value for index " + i + " : ");
            int number1 = sc.nextInt();
            Array[i] = number1;
            stack.push(number1);
        }
        System.out.println("before: ");
        for (int number2 : Array) {
            System.out.println(number2);
        }
        int index =0;
        while (!stack.isEmpty()) {
            Array[index] = stack.pop();
            index++;
        }
        System.out.println("affter: ");
        for (int number3 : Array) {
            System.out.println(number3);
        }
    }
}
