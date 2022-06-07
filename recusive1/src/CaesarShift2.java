
import java.util.Scanner;

public class CaesarShift2 {

    String cshift2(String msg, int[] dist, int i) {
        // You can enter your code here and only here.
        if (msg.length() <= 0) {
            return "";
        }
        int n = dist.length;
        int I = i % n;
        i++;
        int a = msg.charAt(0) + dist[I];
        if (a > (int) 'Z') {
            a = (a - 90) + ((int) 'A' - 1);
        }
        return (char) a + cshift2(msg.substring(1), dist, i);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = scan.next();
        int n = scan.nextInt();
        int[] dist = new int[n];
        for (int i = 0; i < n; ++i) {
            dist[i] = scan.nextInt();
        }
        CaesarShift2 cs = new CaesarShift2();
        String ans = cs.cshift2(msg, dist, 0);
        System.out.println(ans);
    }
}
