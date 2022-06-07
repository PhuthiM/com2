
import java.util.Scanner;

public class AlternateChar {

    String alterMerge(String s1, String s2, int order) {
        // Enter your code here and only here
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 == 1 || n2 == 1) {
            if (order == 1) {
                return s1.charAt(n1 - 1) + "";
            } else {
                return s2.charAt(n2 - 1) + "";
            }
        } else if (s1.length() <= 0) {
            return "";
        } else if (order == 1) {
            return s1.charAt(0) + "" + s2.charAt(1) + alterMerge(s1.substring(2), s2.substring(2), 1);
        } else {
            return s2.charAt(0) + "" + s1.charAt(1) + "" + alterMerge(s1.substring(2), s2.substring(2), 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int order = scan.nextInt();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}
