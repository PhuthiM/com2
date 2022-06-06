
import java.util.Scanner;

public class CovidRisk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] ar = new int[row + 1][col + 1];
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ro = sc.nextInt();
            int co = sc.nextInt();
            for (int r = ro - 1; r <= ro + 1; r++) {
                for (int c = co - 1; c <= co + 1; c++) {
                    if (r == ro && c == co) {
                        ar[r][c] += 2;
                    } else {
                        if (c > col || c < 0 || r > row || r < 0) {
                            continue;
                        } else {
                            ar[r][c]++;
                        }
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if (ar[r][c] > max) {
                    max = ar[r][c];
                }
                System.out.print(ar[r][c] + " ");
            }
            System.out.println("");
        }
        System.out.println(max);
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if (ar[r][c] == max) {
                    System.out.print(r + " ");
                    break;
                }
            }
        }

    }
}
