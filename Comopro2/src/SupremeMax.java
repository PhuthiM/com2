
import java.util.Scanner;

public class SupremeMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sup = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            sup[i] = sc.nextInt();
        }
        int intervalMax = 0; // ค่าสูงสุดในช่วง
        int supMax = 0; // ค่า SupremeMax
        boolean zero = false;
        for (int i = 1; i <= n; ++i) {
            if (sup[i] == 0 && zero == false) {
                System.out.print(intervalMax + " ");
                intervalMax = 0;
                zero = true;
            } else if (sup[i] > intervalMax) {
                intervalMax = sup[i];
                zero = false;
            }
            if (supMax <= intervalMax) {
                supMax = intervalMax;
                zero = false;
            }
        }
        System.out.println("");
        System.out.println(supMax);
        int bestStart = 1; // อินเด็กซ์เริ่มต้นของช่วงที่ค่าสูงที่สุด
        int bestEnd = -1; // อินเด็กซ์สุดท้ายของช่วงที่ค่าสูงที่สุด
        boolean check = false;
        for (int i = 1; i <= n; ++i) {
             if (sup[i] == 0 && check == false) {
                bestStart = i + 1;
            } else if (sup[i] == supMax) {
                check = true;
            } else if (sup[i] == 0 && check == true) {
                bestEnd = i - 1;
                break;
            }
        }
        //   System.out.println("start " + sup[bestStart] + " end " + sup[bestEnd]);
        for (int i = bestStart; i <= bestEnd; ++i) {
           
                System.out.print(sup[i] + " ");
            
        }
        System.out.println("");
    }

}
