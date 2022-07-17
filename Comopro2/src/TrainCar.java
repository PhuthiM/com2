
import java.util.Scanner;

public class TrainCar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int P = sc.nextInt();
        int n = C + P + 1;
        int[] train = new int[n];
        for (int i = 1; i < n; ++i) {
            train[i] = 0;
        }
        int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int t = sc.nextInt();
            int num = sc.nextInt();
            int v = sc.nextInt();
            if (t == 1 && num <= C && num >= 1) {
                if (train[num] + v <= 50) {
                    train[num] += v;
                }
            } else if (t == 2 && num <= n && num > C) {
                if (train[num] + v <= 60) {
                    train[num] += v;
                }
            }
            for (int j = 1; j < n; ++j) {
                System.out.print(train[j] + " ");
            }
            System.out.println("");
        }
    }
}
