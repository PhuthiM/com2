
import java.util.Scanner;

public class NumLayer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int row = sc.nextInt();
        final int col = sc.nextInt();

        int[][] ar = new int[row][col];

        int NUM_LAYERS = 0;
        if (row > col) {
            NUM_LAYERS = col / 2;
        } else {
            NUM_LAYERS = row / 2;
        }
        for (int i = 0; i < NUM_LAYERS; i++) { // i=0
            int val = 0;
            
            //บรรทัดบน
            for (int c = i; c < col - i; c++) {
                ar[i][c] = val;
                val = (val + 1) % 10;
            }

            //บรรทัดข้างขวา
            for (int r = i + 1; r < row - i; r++) {
                ar[r][col - (i + 1)] = val;
                val = (val + 1) % 10;
            }

            //บรรทัดล่าง
            for (int c = col - (i + 2); c >= i + 1; c--) {
                ar[row - (i + 1)][c] = val;
                val = (val + 1) % 10;
            }

            //บรรทัดข้างซ้าย
            for (int r = row - (i + 1); r >= i + 1; r--) {
                ar[r][i] = val;
                val = (val + 1) % 10;
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(ar[r][c] + " ");
            }
            System.out.println("");
        }

    }
}
