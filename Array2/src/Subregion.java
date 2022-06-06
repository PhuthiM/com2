
import java.util.Scanner;

public class Subregion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] area = new int[row + 1][col + 1];
        int p = sc.nextInt();
        int q = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (p <= 0 || (p + h) - 1 > row || q <= 0 || (q + w) - 1 > col) {
            System.out.println("invalid input");
        } else {
            for (int r = p; r <= (p + h) - 1; r++) {
                for (int c = q; c <= (q + w) - 1; c++) {
                    area[r][c] = 1;
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
}
