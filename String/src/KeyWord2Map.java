
import java.util.*;

public class KeyWord2Map {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int max = 0;
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (m.get(str) == null) {
                m.put(str, 1);
                System.out.print(str + " ");
            } else {
                m.put(str, m.get(str) + 1);
            }
            if (m.get(str) > max) {
                max = m.get(str);
            }

        }
        System.out.print("\n" + max);
        for (Map.Entry e : m.entrySet()) {
            if ((int) e.getValue() == max) {
                System.out.print(" " + e.getKey());
            }
        }
        System.out.println("");
    }
}
