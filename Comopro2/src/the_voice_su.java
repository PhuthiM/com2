
import java.util.Scanner;

public class the_voice_su {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int man = 0, girl = 0;
        for (int i = 1; i <= n; i++) {
            int gender = sc.nextInt();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();

            if (score1 == 9 || score1 == 10) {
                if (score2 == 9 || score2 == 10) {
                    if (gender == 1 && man < k) {
                        System.out.println(i + " 1");
                        man++;

                    } else if (gender == 2 && girl < k) {
                        System.out.println(i + " 2");
                        girl++;
                    } else if (gender == 1 && girl < k) {
                        System.out.println(i + " 2");
                        girl++;
                    } else if (gender == 2 && man < k) {
                        System.out.println(i + " 1");
                        man++;
                    }
                } else if (man < k) {
                    System.out.println(i + " 1");
                    man++;
                }
            } else if (score2 == 9 || score2 == 10) {
                if (girl < k) {
                    System.out.println(i + " 2");
                    girl++;
                }
            }

        }
    }
}
