

import java.util.Scanner;

public class bonusWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter one word: ");
        String a = scanner.next();
        System.out.println(firstChar(a));
        System.out.println("Please enter a word: ");
        String b = scanner.next();
        System.out.println(secondChar(b));
        System.out.println("Please enter a word to receive the last letter: ");
        String c = scanner.next();
        System.out.println(lastChar(c));
        System.out.println("Please enter a word to receive the second to last character: ");
        String d = scanner.next();
        System.out.println(secondToLastChar(d));
    }

    public static char firstChar(String a) {
        System.out.println(a);
        return a.charAt(0);
    }
    public static char secondChar(String b){
        System.out.println(b);
        return b.charAt(1);
    }
    public static char lastChar(String c){
        System.out.println(c);
        return c.charAt(c.length()-1);
    }
    public static char secondToLastChar(String d){
        System.out.println(d);
        return d.charAt(d.length()-2);
    }

}