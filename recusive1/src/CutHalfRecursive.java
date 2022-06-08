
import java.util.Scanner;

public class CutHalfRecursive {

    public static String cutHalf(String s) {
        //your code here
        int n = s.length() / 2;
        if (s.length() <= 1) {
            return s ;
        }
        return s.charAt(n) + cutHalf(s.substring(0, n)) + cutHalf(s.substring(n + 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
    }
}
