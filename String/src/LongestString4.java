
import java.util.Scanner;

public class LongestString4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        for (;;) {
            String word = sc.nextLine();
            int w = word.length();
            if ("".equals(word)) {
                break;
            } else if (w >= max) {
                max = word.length();
                longestStr = word;
            }
        }

        System.out.println(longestStr);
    }
}
