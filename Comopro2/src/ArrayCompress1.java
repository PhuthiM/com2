
import java.util.Scanner;

public class ArrayCompress1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            if (array[i] == k) {
                System.out.print(sum + " " + k + " ");
                sum = 0;
            } else if (i == num - 1) {
                sum += array[i];
                System.out.print(sum);
            } else {
                sum += array[i];
            }
        }
    }
}
