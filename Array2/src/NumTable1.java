
import java.util.Scanner;

public class NumTable1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for (int w = 0; w < n; w++) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            if (w1 <= 0 || w1 > r || w2 <= 0 || w2 > c) {
                System.out.print("-");
            } else {
                System.out.print(array[w1][w2]);
            }
        }
    }
}
