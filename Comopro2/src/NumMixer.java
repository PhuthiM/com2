
import java.util.Scanner;

public class NumMixer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; ++i) {
            B[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k > 0) {
            for (int i = 0; i < N; ++i) {
                System.out.print(A[i] + " " + B[N - i - 1] + " ");
            }
        } else {
            for (int i = 0; i < N; ++i) {
                System.out.print(B[N - i - 1] + " "+ A[i] + " " );
            }
        }
    }
}
