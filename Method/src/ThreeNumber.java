
import java.util.Scanner;

public class ThreeNumber {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int med = 0;

    static int MaxNumber(int number) {

        if (number > max) {
            max = number;
        }

        return max;
    }

    static int MinNumber(int number) {
        if (number < min) {
            min = number;
        }
        return min;
    }

    static int MedNumber(int[] number, int i) {
        med = number[i];
        return med;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = 0;
        int d = 0;
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            int number = sc.nextInt();
            x = MaxNumber(number);
            n = MinNumber(number);
            a[i] = number;
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] != max && a[i] != min) {
                d = MedNumber(a, i);
            }
        }

        int k = sc.nextInt();
        switch (k) {
            case -1:
                System.out.println(n);
                break;
            case 0:
                System.out.println(d);
                break;
            case 1:
                System.out.println(x);
                break;
            default:
                break;
        }
    }
}
