
import java.util.Scanner;

public class CharSweep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int index = sc.nextInt();
        int direc = sc.nextInt();
        char want = word.charAt(index);
        String str = "";
        if (direc == 1) {
            for (int i = index; i < word.length(); i++) {
                if (want <= word.charAt(i)) {
                    str += word.charAt(i);
                }
            }
            for (int i = 0; i <index; i++) {
                if (want <= word.charAt(i)) {
                    str += word.charAt(i);
                }
            }
        } else if (direc == -1) {
            for (int i = index; i >= 0; i--) {
                if (want <= word.charAt(i)) {
                    str += word.charAt(i);
                }
            }
            for (int i = word.length() - 1; i > index; i--) {
                if (want <= word.charAt(i)) {
                    str += word.charAt(i);
                }
            }

        }

        System.out.println(str);
    }
}
/*
AFJKQWERJGKJASFJBFHWQFLKCWEJQD
9
1

AFJKQWERJGKJASFJBFHWQFLKCWEJQD
9
-1
*/