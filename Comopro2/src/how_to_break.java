
import java.util.Scanner;

public class how_to_break {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (;;) {
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
