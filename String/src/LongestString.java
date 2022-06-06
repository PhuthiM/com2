
import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();
            if (word.length() > max) {
                max = word.length();
            }
        }
        System.out.println(max);

    }
}
