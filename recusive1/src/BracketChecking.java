
import java.util.Scanner;

public class BracketChecking {

    static boolean CheckBracket(String s) {
        int n = s.length();
        if (n <= 0) {
            return true;
        }
        int bracketopen = s.indexOf("{");
        int bracketclose = s.lastIndexOf("}");
        int min = Math.min(bracketopen, bracketclose);
        int max = Math.max(bracketopen, bracketclose);
        // System.out.println(".min .max" + min + " " + max);
        if (min < 0 && max < 0) {
            return true;
        } else if (min < 0 || max < 0) {
            return false;
        } else {
            String s0 = s.substring(0, min);
            String s1 = s.substring(min + 1, max);
            String s2 = s.substring(max + 1);
            return CheckBracket(s0 + s1 + s2);

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(CheckBracket(str));
    }
}
