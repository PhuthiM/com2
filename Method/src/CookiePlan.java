
import java.util.Scanner;

public class CookiePlan {

    static int planCookie(int[] Flour, int[] Butter) {
        int n = 0;
        for (int i = 0; i < Flour.length; i++) {
            if (Flour[i] / 6 < 10 || Butter[i] / 3 < 10) {
                System.out.println(i + 1);
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for (int i = 0; i < N; i++) {
            flours[i] = sc.nextInt();
            butters[i] = sc.nextInt();
        }
        int num = planCookie(flours, butters);
        System.out.println("There are " + num + " days that ingredients are insufficient");

    }

}
