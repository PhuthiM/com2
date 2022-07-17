
import java.util.Scanner;

public class Auction1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] auc = new int[n + 1];
        int[] count = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            auc[i] = sc.nextInt();
            count[i] = 1;
        }
        int k = sc.nextInt();

        for (int j = 0; j < k; j++) {
            for (int i = 1; i <= n; i++) {
                int price = sc.nextInt(); //ราคาที่ประมูลสินค้าใหม่ 
                if (price > auc[i] && count[i] <= 3) {
                    // System.out.println("i " + i + " price " + price);
                    auc[i] = price;
                    count[i] = 1;
                } else {
                    count[i]++;
                }
                System.out.print(auc[i] + " ");
            }
            System.out.println("");
        }
    }
}
