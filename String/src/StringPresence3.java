
import java.util.Scanner;

public class StringPresence3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] substr = new String[n];
        int[] count = new int[n];
        int[] firstcount = new int[n];
        int[] lastcount = new int[n];
        boolean c = false;
        for (int i = 0; i < n; i++) {
            substr[i] = sc.next();
        }
        int k = sc.nextInt();

        String first;
        String end;
        for (int j = 0; j < k; j++) {
            String word = sc.next();
            // ตัวเริ่ม
            first = " ";
            int start = Integer.MAX_VALUE;
            int maxlenth1 = Integer.MIN_VALUE;
            // ตัวท้าย
            end = " ";
            int last = Integer.MIN_VALUE;
            int maxlenth2 = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (word.contains(substr[i])) {
                    count[i]++;
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
            for (int i = 0; i < n; i++) {
                if (first.equals(substr[i])) {
                    firstcount[i]++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (end.equals(substr[i])) {
                    lastcount[i]++;
                }
            }
        }
        if (!c) {
            System.out.println("none");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(count[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i < n; i++) {
                System.out.print(firstcount[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i < n; i++) {
                System.out.print(lastcount[i] + " ");
            }
        }
    }
}
