
import java.util.Scanner;

public class ShrinkAndExpand {

    String shrinkAndExpand(String s) {
        int n = s.length();
        if (n <= 1) {
            return s + s ;
        }
        char word1 = s.charAt(0);
        char word2 = s.charAt(1);
        //System.out.println(word1 + ":" + word2);
        if (word1 == word2) {
            return word1 + shrinkAndExpand(s.substring(2));
        } else {
            return word1 + "" + word1 + shrinkAndExpand(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
    }
}
