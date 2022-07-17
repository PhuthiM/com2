
import java.util.Scanner;

public class ArrayJump2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int[] jumpA = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            jumpA[i] = sc.nextInt();
        }
        int jump = start;
        for (int i = 1; i <= n; i++) {

            if (jump <= n) {
                System.out.println(jump + " " + jumpA[jump]);
                jump += jumpA[jump];
            } else {
                System.out.println("out of bounds");
                break;
            }
        }
    }
}
