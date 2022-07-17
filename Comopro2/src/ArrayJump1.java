
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayJump1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jumpA = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            jumpA[i] = sc.nextInt();
        }
        int jump = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            if (jump <= n && count <= 5) {
                if (count == 5) {
                    System.out.println(jump + " " + jumpA[jump]);
                    break;
                }
                System.out.println(jump + " " + jumpA[jump]);
                count++;
                jump += jumpA[jump];
            }
            else if (jump > n) {
                System.out.println("out of bounds");
                break;
            }

        }

    }
}
