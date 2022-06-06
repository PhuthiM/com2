
import java.util.Scanner;

public class AlternateJump {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array2[i] = sc.nextInt();
        }
        boolean one = true;
        boolean two = true;
        int count1 = 1;
        int count2 = 1;
        int max1 = 0;
        int max2 = 0;
        while (count1 <= n && count2 <= n) {
            if (one) {
                if (!two) {
                    if (count1 + array2[count2] > n) {
                        count1 += array2[count2];
                        continue;
                    } else {
                        count1 += array2[count2];
                    }
                    two = true;
                }
                if (array1[count1] % 2 == 0) {
                    System.out.println("1 " + count1 + " " + array1[count1]);
                    count1 += array1[count1];
                } else {
                    System.out.println("1 " + count1 + " " + array1[count1]);
                    one = false;
                }
                max1++;
            } else {
                if (two) {
                    if (count2 + array1[count1] > n) {
                        count2 += array1[count1];
                        continue;
                    } else {
                        count2 += array1[count1];
                    }
                    two = false;
                }
                if (array2[count2] % 2 == 0) {
                    System.out.println("2 " + count2 + " " + array2[count2]);
                    count2 += array2[count2];
                } else {
                    System.out.println("2 " + count2 + " " + array2[count2]);
                    one = true;
                }
                max2++;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
/*
17
4 2 2 1 2 3 1 2 5 1 1 2 6 2 1 2 2
2 4 3 4 3 2 5 3 3 2 3 4 2 5 7 8 2
 */
