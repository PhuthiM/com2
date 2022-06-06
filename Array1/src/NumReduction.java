
import java.util.Scanner;

public class NumReduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int pos = sc.nextInt();
            int k = sc.nextInt();
            for (int a = pos - 2; a <= pos + 2; a++) {

                if (a <= 0 || a > n || ar[a] < 0) {
                    continue;
                } else {
                    if (ar[a] - k > 0) {
                        //  System.out.println(a);
                        ar[a] -= k;
                    } else {
                        ar[a] = 0;
                    }
                }
            }
            for (int a = 1; a <= n; a++) {
                System.out.print(ar[a] + " ");
            }
            System.out.println("");
        }

    }
}
