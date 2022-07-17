
import java.util.Scanner;


public class Partition1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int half = n / 2;
        for (int i = 0; i < n; i++) {
            if (array[half] >= array[i]) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (array[half] < array[i]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
