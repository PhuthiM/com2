
import java.util.LinkedHashMap;
import java.util.Scanner;

public class KeyWord1Map {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (m.get(str) == null) {
                m.put(str, i);
                System.out.print(str + " ");
            }
        }
    }
}
