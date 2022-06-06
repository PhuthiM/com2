
import java.util.Scanner;

public class ShootingString1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char a = A.charAt(0);
        for (;;) {
            String word = sc.next();
            if (word.equals("Z")) {
                break;
            } else {
                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == a) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
