
import java.util.Scanner;

public class Box1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] box = new int[n + 1];
        int[] box2 = new int[n + 1]; //limit_box
        for (int i = 1; i <= n; i++) {
            box[i] = sc.nextInt();
            box2[i] = 0;
        }
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
            int order = sc.nextInt();
            int q = sc.nextInt();
            int b = sc.nextInt();
            if (order == 1) {
                if (box2[b] + q <= box[b]) { //ค่าที่ต้องการใส่มีค่าน้อยกว่าค่าที่ใส่ได้
                    box2[b] += q;
                    System.out.println(box2[b]);
                } else {
                    System.out.println("-1");
                }
            } else if (order == 2) {
                if (box2[b] - q >= 0) { //ค่าที่ต้องการหยิบมีค่าน้อยกว่าค่าที่อยู่ในกล่อง
                    box2[b] -= q;
                    System.out.println(box2[b]);
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}
