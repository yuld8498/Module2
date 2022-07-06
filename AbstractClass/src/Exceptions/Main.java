package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void isTrue(){
        Integer a = 200;
        Integer b =200;
        try {
            int result = a/b;
            System.out.println("Non Exception");
        }catch (Exception e){
            System.out.println("Catch Exception ");
//        }catch (FileNotFoundException e){
//            System.out.println("aaaa");
        }
    }
    public static void isFalse(){
        int a =0;
        int b=10;
        try {
            int result =b/a;
            System.out.println("None Exception");
        }catch (Exception e){
            System.out.println("Catch Exception");
        }
    }
    public static void main(String[] args) {
       isTrue();
       isFalse();
    }
}
