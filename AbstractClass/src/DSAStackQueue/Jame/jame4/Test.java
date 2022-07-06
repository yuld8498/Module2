package DSAStackQueue.Jame.jame4;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character string: ");
        String text = scanner.nextLine();
        text.toLowerCase();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            treeMap.put(String.valueOf(text.charAt(i)), 0);
        }
        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        Map.Entry<String, Integer>[] entryArray = entrySet.toArray(new Map.Entry[entrySet.size()]);
        for (int i = 0; i < text.length(); i++) {
            Character key = text.charAt(i);
            int count =1;
            for (int j = 0; j < entryArray.length; j++) {
                entryArray[j].getValue().equals(String.valueOf(key));
                if (entryArray[j].getValue().equals(key)) {
                    treeMap.replace(entryArray[i].getKey(),count);
                    count++;
                    System.out.println(entryArray[j].getValue().equals(key));
                }
            }
        }
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
    }
}
