
import java.util.Scanner;

public class SameLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str1 = new String[n];
        int[] countstr1 = new int[n];
        for (int i = 0; i < n; i++) {
            str1[i] = sc.next();
            countstr1[i] = str1[i].length();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            String str2 = sc.next();
            int costr2 = str2.length();
            for (int j = 0; j < n; j++) {
                if (countstr1[j] == costr2) {
                    System.out.print(str1[j].charAt(0) + " ");
                }
            }
            System.out.println("");
        }

    }
}
