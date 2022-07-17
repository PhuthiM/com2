
import java.util.Scanner;

public class CondoSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstRoom = sc.nextInt();
        int lastRoom = firstRoom + n;
        int[] room = new int[lastRoom + 1];
        int k = sc.nextInt();
        int count = 0;
        for (int j = 0; j < k; j++) {
            int reserve = sc.nextInt();
            if (reserve >= firstRoom && reserve < lastRoom) {
                if (room[reserve] == 0) {
                    room[reserve] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = firstRoom; i < lastRoom; i++) {
            if (room[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
