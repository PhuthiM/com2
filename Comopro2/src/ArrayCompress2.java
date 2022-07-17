
import java.util.Scanner;

public class ArrayCompress2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        final int k = sc.nextInt();
        final int k2 = sc.nextInt();
        final int k3 = sc.nextInt();
        int sum = 0, count = 0;

        for (int i = 0; i < num; i++) {
            if (array[i] == k || array[i] == k2 || array[i] == k3) {
                if (count == 0) {
                    if (i == 0) {
                        System.out.print(array[i] + " ");
                        count = 1;
                    } else {
                        System.out.print(sum + " " + array[i] + " ");
                        sum = 0;
                        count = 1;
                    }
                }
            } else if (i == num - 1) {
                sum += array[i];
                count = 0;
                System.out.print(sum);
            } else {
                sum += array[i];
                count = 0;
            }
        }
    }
}
