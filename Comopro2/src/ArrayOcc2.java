
import java.util.Scanner;

public class ArrayOcc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] array = new int[n];
        int k = sc.nextInt();
        int countSuc = 0; // เก็บจำนวนคนจองสำเร็จ
        int countOut = 0; // เก็บจำนวนจองไม่สำเร็จเพราะเลขนอกขอบเขต
        int countRe = 0; //เก็บค่าที่คนจองไม่สำเร็จเพราะมีคนจองแล้ว
        int arrayMax = 0; // array ที่โดนจองมากที่สุด
        for (int i = 0; i < k; i++) {
            int number = sc.nextInt();
            int m = number - 1;
            if (number <= 0 || number > n) {
                countOut++;
            } else if (array[m] == 0) {
                countSuc++;
                array[m]++;
                if (arrayMax < array[m]) {
                    arrayMax = array[m];
                }
            } else if (array[m] > 0) {
                countRe++;
                array[m]++;
                if (arrayMax < array[m]) {
                    arrayMax = array[m];
                }
            }

        }
        int count = 0;
        int max = 0;
        int[] countMax = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                count++;
                if (count >= max) {
                    max = count;
                    countMax[i] = max;
                }
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        System.out.println( max);
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                if (countMax[i] == max) {
                    System.out.print((i + 1) + " ");
                }
            }
        }

    }
}
