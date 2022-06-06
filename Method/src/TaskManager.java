
import java.util.Scanner;

public class TaskManager {

    static int sumcpu;
    static int sumram;

    static void reportLoad(int cpuAll, int ramAll, int cpuUsed, int ramUsed) {

        sumcpu = (cpuUsed * 100) / cpuAll;
        System.out.println("CPU: " + cpuUsed + "/" + cpuAll + " (" + sumcpu + "%)");
        sumram = (ramUsed * 100) / ramAll;
        System.out.println("RAM: " + ramUsed + "/" + ramAll + " (" + sumram + "%)");
        if (sumcpu >= 80) {
            System.out.println("Limited CPU power");
        }
        if (sumram >= 80) {
            System.out.println("Limited RAM availability");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpuAll = scan.nextInt();
        int ramAll = scan.nextInt();
        int cpuUsed = scan.nextInt();
        int ramUsed = scan.nextInt();
       
        reportLoad(cpuAll, ramAll, cpuUsed, ramUsed);
    }

}/*
20
40
16
39
 */
