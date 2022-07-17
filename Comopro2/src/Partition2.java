
import java.util.Scanner;

public class Partition2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int half = n / 2;
        int count = 0;
        int[] arraysum = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[half] >= array[i]) {
                count++;
                arraysum[count] = array[i];
            }
        }
        int half2 = (count / 2) + 1;
    
        for (int i = 1; i <= count; i++) {
            if (arraysum[i] <= arraysum[half2]) {
                System.out.print(arraysum[i]+" ");
            }
        }
        System.out.println("");
        for (int i = 1; i <= count; i++) {
            if (arraysum[i] > arraysum[half2]) {
                System.out.print(arraysum[i]+" ");
            }
        }
    }
}
