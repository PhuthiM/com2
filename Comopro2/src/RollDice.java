
import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pts = new int[n];
        for (int i = 0; i < n; ++i) {
            pts[i] = sc.nextInt();
        }
        int[] extra_move = new int[n];
        for (int i = 0; i < n; i++) {
            extra_move[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int loc = 0, score = 0;
       // System.out.println("location " + loc);
        for (int i = 0; i < p; i++) {
            int move = sc.nextInt();
            loc = loc + move;
            if (loc > n - 1) {
                loc = loc - n;
            }
            score += pts[loc];
            // System.out.println("before : location" + loc + " score " + score);

            if (extra_move[loc] != 0) {
                loc = loc + extra_move[loc];
                if (loc > n - 1) {
                    loc = loc - n;
                } else if (loc < 0) {
                    loc = n + loc;
                }
                score += pts[loc];
                //System.out.println("after : location " + loc + " score" + score);
               
            } System.out.println(loc + " " + score);
        }
    }
}
