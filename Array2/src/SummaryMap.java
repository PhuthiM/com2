
import java.util.Scanner;

public class SummaryMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] area = new int[row + 1][col + 1];
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            boolean check = false;
            if (p <= 0 || (p + h) - 1 > row || q <= 0 || (q + w) - 1 > col) {
                continue;
            } else {
                for (int r = p; r <= (p + h) - 1; r++) {
                    for (int c = q; c <= (q + w) - 1; c++) {
                        if (area[r][c] == 1) {
                            check = true;
                        }
                    }
                }
                if (!check) {
                    for (int r = p; r <= (p + h) - 1; r++) {
                        for (int c = q; c <= (q + w) - 1; c++) {
                            area[r][c] = 1;
                        }
                    }
                }
            }
        }
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                System.out.print(area[r][c] + " ");
            }
            System.out.println("");
        }
    }
}
