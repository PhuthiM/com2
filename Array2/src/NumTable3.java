
import java.util.Scanner;

public class NumTable3 {

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
        boolean space = false;
        int s = 0;
        int count = 0;
        int num = 0;
        int max = Integer.MIN_VALUE;
        String[] str = new String[10000];
        for (int w = 0; w < n; w++) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            if (w1 <= 0 || w1 > r || w2 <= 0 || w2 > c) {
                if (s == 0) {
                    space = true;
                } else if (!space) {
                    num++;
                    str[num] = "";
                    count = 0;
                    space = true;
                    s = 1;
                }
            } else {
                count += 1;
                str[num] += array[w1][w2];
                space = false;
                s = 1;
            }
            if (max < count) {
                max = count;
            }
        }
        
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (str[i].length() == max) {
                sum++;
            }
        }
        System.out.println(max);
        System.out.println(sum);
    }
}
