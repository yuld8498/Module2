package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String mail = "facebook.com/vala.a";
        String regex = "^(http:\\/\\/)?(?:www\\.)?facebook\\.com\\/\\S{5,}(\\w*(\\.\\w+)*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        System.out.println(matcher.matches());
        Scanner scanner = new Scanner(System.in);
        System.out.println("input you have money: ");
        String money = scanner.nextLine();
        String regex2 = "^[1-9]+\\d*\s?(VND|vnd)$";
        Pattern pattern1 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(money);
        System.out.println(matcher1.matches());
        money.concat(mail);
        System.out.println(money.concat(mail));
        System.out.println(mail);
    }
}
