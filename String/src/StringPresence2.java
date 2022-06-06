
import java.util.Scanner;

public class StringPresence2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] substr = new String[n];
        for (int i = 0; i < n; i++) {
            substr[i] = sc.next();
        }
        String word = sc.next();
        boolean c = false;
        int start = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        int maxlenth1 = Integer.MIN_VALUE;
        int maxlenth2 = Integer.MIN_VALUE;
        String first = "";
        String end = " ";
        for (int i = 0; i < n; i++) {
            if (word.contains(substr[i])) {
                System.out.print(substr[i] + " ");
                c = true;
                if (start >= word.indexOf(substr[i])) {
                    start = word.indexOf(substr[i]);
                    if (substr[i].length() > maxlenth1) {
                        maxlenth1 = substr[i].length();
                        first = substr[i];
                    } else {
                        first = substr[i];
                    }
                }
                if (last <= word.lastIndexOf(substr[i])) {
                    last = word.lastIndexOf(substr[i]);
                    if (substr[i].length() > maxlenth2) {
                        maxlenth2 = substr[i].length();
                        end = substr[i];
                    } else {
                        end = substr[i];
                    }

                }
            }
        }
        if (!c) {
            System.out.println("none");
        } else {
            System.out.println("");
            System.out.println(first);
            System.out.println(end);
        }
    }
}
/* 
5
si lpa korn uni sity
ohsitylauniWkornlpc 
 */
