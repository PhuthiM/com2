
import java.util.Scanner;

public class Lease1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] room = new int[n];
        for (int i = 0; i < n; i++) {
            room[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((room[i] + year - 1) + " ");
        }
    }
}
