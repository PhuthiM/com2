
import java.util.Scanner;

public class reserve_3_vans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (a <= b && a <= c) {
                System.out.println("A");
                a += num;
               
            } else if (b < a && b <= c) {
                System.out.println("B");
                b += num;
                
            } else if (c < b && c < a) {
                System.out.println("C");
                c += num;
               
            }
        }
    }
}
