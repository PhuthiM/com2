
import java.util.Scanner;

public class Lease2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] room = new int[n];
        for (int i = 0; i < n; i++) {
            room[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        for (int i = 0; i < n; i++) {
            room[i] = room[i] + year - 1;
        }
        int num = sc.nextInt();

        for (int j = 0; j < num; j++) {
            int yearQ = sc.nextInt();
            boolean full = true;
            for (int i = 0; i < n; i++) {
                if (yearQ > room[i]) {
                    System.out.print((i + 1) + " ");
                    full = false;
                }
            }
            if (full) {
                System.out.print("full");
            }
            System.out.println("");
        }
    }
}
