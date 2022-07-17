
import java.util.Scanner;

public class SlotRsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n + 1];
        int[] array2 = new int[n + 1];
        int k = sc.nextInt();
        int p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            int num = sc.nextInt();
            if (array1[num] < k) {
                System.out.println("1");
                array1[num]++;
            } else {
                System.out.println("2");
                array2[num]++;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
