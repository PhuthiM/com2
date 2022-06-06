
import java.util.Scanner;

public class PalindromeMaker {

    String makePalindrome(String str) {
        // โคดของคุณอยู-ที่นี่
        int n = str.length();
        if (n == 0) {
            return "";
        }
        char word1 = str.charAt(0);
        char word2 = str.charAt(n - 1);
        if (n == 1) {
            return word1 + "";
        } else if (word1 == word2) {
            return word1 + makePalindrome(str.substring(1, n - 1)) + word2;
        } else {
            return makePalindrome(str.substring(1, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        PalindromeMaker maker = new PalindromeMaker();
        String result = maker.makePalindrome(text);
        System.out.println(result);
    }
}
