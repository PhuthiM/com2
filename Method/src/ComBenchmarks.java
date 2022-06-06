
import java.util.Scanner;
public class ComBenchmarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpuPow = scan.nextInt();
        int gpuPow = scan.nextInt();
        int ramAmt = scan.nextInt();
        int cpuPrc = scan.nextInt();
        int gpuPrc = scan.nextInt();
        int ramPrc = scan.nextInt();
        ComAndBench comB = new ComAndBench(cpuPow, ramAmt, gpuPow, cpuPrc, ramPrc, gpuPrc);
        comB.runAllBenches();
        comB.reportPerfPerPrice();
    }
}

class ComAndBench {
    int totalPrice;
    int cpuPow; // พลังคำนวนของ CPU
    int ramAmt; // ปริมาณหน่วยค.จำ
    int gpuPow; // พลังคำนวนของง GPU
    int cpuPrc; // ราคา CPU
    int ramPrc; // ราคาแรม
    int gpuPrc; // ราคาของ GPU
    int WindStrike, PastMark, Soreal, SiSandro;

    public ComAndBench(int cpuPow, int ramAmt, int gpuPow, int cpuPrc, int ramPrc, int gpuPrc) {
        this.cpuPow = cpuPow;
        this.ramAmt = ramAmt;
        this.gpuPow = gpuPow;
        this.cpuPrc = cpuPrc;
        this.ramPrc = ramPrc;
        this.gpuPrc = gpuPrc;
        totalPrice = cpuPrc + ramPrc + gpuPrc;
    }

    void runWindStrike() {
        WindStrike = cpuPow + gpuPow;
        if (ramAmt <= 4) 
            WindStrike /= 2;
         else if (ramAmt > 8) 
            WindStrike *= 2;
        
    }

    void runPastMark() {
        if (cpuPow > gpuPow) 
            PastMark = cpuPow;
         else 
            PastMark = gpuPow;
    }

    void runSoreal() {
        Soreal = gpuPow + (cpuPow / 2);
        if (PastMark < 300) 
            Soreal /= 2;
    }

    boolean runSiSandro() {
        SiSandro = (ramAmt * 100) + cpuPow;
        if (ramAmt < 4) {
            System.out.println("SiSandro Failed");
            return false;
        } else 
            return true;
        
    }

    void runAllBenches() {
        runWindStrike();
        runPastMark();
        runSoreal();
        boolean c = runSiSandro();
        System.out.println("WindStrike: " + WindStrike);
        System.out.println("PastMark: " + PastMark);
        System.out.println("Soreal: " + Soreal);
        if (!c) 
            System.out.println("SiSandro: Failed");
        else 
            System.out.println("SiSandro: " + SiSandro);      
    }

    void reportPerfPerPrice() {
        int k = WindStrike + PastMark + Soreal;
        System.out.println("Performance per Price = " + (k / totalPrice));
    }
}
