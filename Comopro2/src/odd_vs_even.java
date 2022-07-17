
import java.util.Scanner;

public class odd_vs_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        for (int i = 0; i < 8; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        if (even > odd) {
            System.out.println("even");
        } else if (odd > even) {
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
