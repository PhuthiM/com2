
import java.util.Scanner;

public class Box2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] box = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            box[i] = sc.nextInt();
        }
        int[] box2 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            box2[i] = 0;
        }
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
            int order = sc.nextInt();
            if (order == 1) {
                int q = sc.nextInt();
                int b = sc.nextInt();
                if (box2[b] + q <= box[b]) { //ค่าที่ต้องการใส่มีค่าน้อยกว่าค่าที่ใส่ได้
                    box2[b] += q;
                    System.out.println(box2[b]);
                } else {
                    System.out.println("-1");
                }
            } else if (order == 2) {
                int q = sc.nextInt();
                //  boolean c = false;
                for (int i = 1; i <= n; i++) {
                    if (box2[i] >= 0) {
                        if (box2[i] - q >= 0) {
                            box2[i] -= q;
                            q = 0;
                            System.out.print(i + " " + box2[i] + " ");
                            break;
                        } else if (i == n && box2[i] < q) {
                            box2[i] = 0;
                            System.out.print(i + " " + box2[i]);
                        } else {
                            q -= box2[i];
                            box2[i] = 0;
                        }
                    }
                    // System.out.print(box2[i] + " ");
                }
                System.out.println("");
            }
        }
    }
}
