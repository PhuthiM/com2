
import java.util.Scanner;

public class KeyWord2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] words = new String[n]; //อาเรย์เก็บสตริง
        int count = 0;
        int[] countmax = new int[n];
        for (int i = 0; i < n; i++) {
            countmax[i] = 1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String w = sc.next();
            boolean c = false;
            //มีข้อความอยู่ม้าย
            for (int j = 0; j < count; j++) {
                if (w.equalsIgnoreCase(words[j])) {
                    countmax[j]++;
                    if (countmax[j] > max) {
                        max = countmax[j];
                    }
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
        System.out.println("");
        System.out.print(max + " ");
        for (int i = 0; i < count; i++) {
            if (countmax[i] == max) {
                System.out.print(words[i] + " ");
            }

        }
    }
}
/*
11
CAT BAT DOG CAT DOG PIG ANT CAT DOG RAT BAT
CAT BAT DOG PIG ANT RAT
3 CAT DOG

8
PUBG ROV DOTA LEAGE ROV DOTA PUBG CSGO
PUBG ROV DOTA LEAGE CSGO
2 PUBG ROV DOTA

10
JAVA C C++ C# PYTHON C C# PASCAL PYTHON C
JAVA C C++ C# PYTHON PASCAL
3 C
 */
