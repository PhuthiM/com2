
import java.util.Scanner;

public class SplitStats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean ab = false;
        int count = 0;
        int max = 0;
        int countstr = -1;
        String str = " ";
        String maxstr = "";
        String[] s = new String[10000];
        for (int i = 0; i < word.length(); i++) {
            if (i + 1 < word.length()) {
                if (word.charAt(i) == 'A') {
                    if (word.charAt(i + 1) == 'B') {
                        //   System.out.println(i);
                        ab = true;
                        countstr = 0;
                    }
                }
                if (word.charAt(i) == 'C') {
                    if (word.charAt(i + 1) == 'D' && ab) {
                        System.out.println(i);
                        System.out.println(str);
                        ab = false;
                        count++;
                        if (countstr >= max) {
                            max = countstr - 2;
                        }
                        s[count] = str;
                        System.out.println("sc" + s[count]);
                        countstr = -1;
                        str = "";
                    }
                }
                if (countstr >= 0) {
                    countstr++;
                    str += word.charAt(i);
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
        for (int i = 1; i <= count; i++) {
            // System.out.println(s[i].length());
            if (s[i].length() == max + 2) {
                System.out.println(s[i]);
            }

        }

        //System.out.println(maxstr);
    }
}
