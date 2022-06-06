
import java.util.Scanner;

public class ProcessInfo {

    static int count = 0;
    static int countRam = 0;

    static boolean listProcesses(String[] name, int[] numRam, int all, int n) {
        countRam += numRam[count];
        if (numRam[count] >= 10) {
            System.out.println(name[count] + "* " + numRam[count]);
        } else {
            System.out.println(name[count] + " " + numRam[count]);
        }
        count++;
        if (count == n) {
            System.out.println("RAM used = " + countRam + " out of " + all);
        }
        if (countRam > all) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] numRam = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            numRam[i] = sc.nextInt();
        }
        int all = sc.nextInt();
        boolean c = true;
        boolean ch = true;
        for (int i = 0; i < n; i++) {
            c = listProcesses(name, numRam, all, n);
            if (c == false) {
                ch = false;
            }
        }
        if (ch) {
            System.out.println("Sufficient RAM");
        } else {
            System.out.println("Not enough RAM");
        }
    }
}
/*
8
Word 2
Moodle 3
Civ 6
Chrome 12
FireFox 10
Edge 9
Octave 1
PDF 2
32
 */
