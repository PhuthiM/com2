
import java.util.Scanner;

public class ArrayOcc1 {

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
        System.out.println(countSuc);
        System.out.println(countOut);
        System.out.println(countRe);
        for (int i = 0; i < n; i++) {
            if (array[i] == arrayMax) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
/*
6
14
5 3 2 -1 -8 7 7 0 -1 -1 7 2 4 3
*/
