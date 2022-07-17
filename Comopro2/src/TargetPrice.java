
import java.util.Scanner;

public class TargetPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            price[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int j = 0; j < q; j++) {
            // Fill in loop
            final int K = sc.nextInt();
            final int mid = sc.nextInt();
            int half = K / 2;
            int pos0 = mid - half;
            int pos1 = mid + half;
            if (pos0 <= 0 || pos1 > n) {
                int sum = 0; //เก็บผลลัพธ์เท่าที่ทำได้
                for (int i = pos0; i <= pos1; i++) {
                    if (i <= 0 || i > n) {
                        /// do 
                    } else {
                        sum += price[i];
                    }
                }
                System.out.println("no " + sum);
            } else {
                int result = 0;
                for (int i = mid - half; i <= mid + half; i++) {
                    result += price[i];
                }
                System.out.println(result);
            }
        }
    }
}
