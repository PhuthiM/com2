
import java.util.Scanner;

public class LongestString2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();
            int w = word.length();
            if (w > max) {
                max = word.length();
                longestStr = word;
            }
        }
    //    System.out.println(max);
        System.out.println(longestStr);
    }
}
