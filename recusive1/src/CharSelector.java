
import java.util.Scanner;

public class CharSelector {

    String selectChar(String s, int[] k) {
        // Enter your code here and only here
        int n = s.length(); // ความยาวสตริง
        if (n <= 0) {
            return "";
        }
        int ad = k[n - 1];  // ค่าของตำแหน่งเดิม
        int result = n - ad - 1; // ตำแหน่งของค่าที่เปลียน
        //   System.out.println("N " + n + " AD " + ad + " RE " + result);
        if (result <= 0) {
            result = n - (ad % n) - 1;
            //  System.out.println("TT" + result);
        }
        // System.out.println(s.charAt(result));
        return selectChar(s.substring(0, n - 1), k) + s.charAt(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        final int N = s.length();
        int[] k = new int[N];
        for (int i = 0; i < N; ++i) {
            k[i] = scan.nextInt();
        }
        CharSelector selector = new CharSelector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);
    }
}
