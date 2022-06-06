
import java.util.Scanner;

public class CharLotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lotto = new String[12];
        for (int i = 0; i < 12; i++) {
            lotto[i] = sc.next();
        }

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int count = 0;
            String Charlot = sc.next();
            for (int j = 0; j < 12; j++) {
                if (Charlot.equals(lotto[j])) {
                    count++;
                }
            }
            System.out.print(count + " ");
            sum += count;
        }
        System.out.println("\n" + sum);
    }
}
