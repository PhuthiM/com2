
import java.util.Scanner;

public class KeyWord1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] words = new String[n]; //อาเรย์เก็บสตริง
        int count = 0;
        for (int i = 0; i < n; i++) {
            String w = sc.next();
            boolean c = false;
            //มีข้อความอยู่ม้าย
            for (int j = 0; j < count; j++) {
                if (w.equalsIgnoreCase(words[j])) {
                    c = true;
                    break;
                }
            }
            // ไม่มีก็มาเก็บในอารเย์
            if (!c) {
                words[count] = w;
                System.out.print(words[count] + " ");
                count++;
            }
        }
    }
}
