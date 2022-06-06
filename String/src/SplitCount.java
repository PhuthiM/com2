
import java.util.Scanner;

public class SplitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        //   System.out.println(word.length());
        boolean AB = false;
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i + 1 < word.length()) {
                if (word.charAt(i) == 'A' && word.charAt(i + 1) == 'B' && !AB) {
                    AB = true;
                    System.out.println("char A " + i);
                } else if (word.charAt(i) == 'C' && word.charAt(i + 1) == 'D' && AB) {
                    AB = false;
                    count++;
                    System.out.println("char C " + i);
                }
            }

        }
        System.out.println(count);
    }
}
