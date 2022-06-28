package AutomaticTest.Source;

import java.util.Scanner;

public class FIzzBuzz {
    public static void fizzBuzz() {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input a number greatthan 0: ");
            inputNumber = scanner.nextInt();
            if (inputNumber < 0) {
                System.out.println("Number is wrong, retype.");
            }
        } while (inputNumber < 0);
        if (inputNumber % 3 == 0 && inputNumber % 5 == 0) {
            System.out.println("FIzzBuzz");
        } else if (inputNumber % 3 == 0) {
            System.out.println("FIzz");
        } else if (inputNumber % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(inputNumber);
    }
    public static void inOf(int number){
        String convertFromNumber = String.valueOf(number);
        for (int i =0;i< convertFromNumber.length();i++){
            if (convertFromNumber.charAt(i)% 3 ==0){
                System.out.println("Fizz");
            }
        }
    }

    public static void main(String[] args) {
        inOf(154369);
    }
}
