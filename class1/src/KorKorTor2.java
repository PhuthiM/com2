
import java.util.Scanner;

public class KorKorTor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameP = sc.next();
        int n = sc.nextInt();
        String[] partyname = new String[n];
        for (int i = 0; i < n; i++) {
            partyname[i] = sc.next();
        }
        Precinct precinct = new Precinct(nameP, partyname);
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
            int P = sc.nextInt();
            if (P == 1) {
                int vote = sc.nextInt();
                precinct.count(vote);
            } else if (P == 2) {
                precinct.printinfo();
            } else if (P == 3) {
                precinct.printMax();
            }
        }
    }
}

class Precinct {

    String precicnt;
    String[] partyname;
    int[] partyScore;
    int max = 0;

    public Precinct(String precicnt, String[] partyname) {
        this.precicnt = precicnt;
        this.partyname = partyname;
        partyScore = new int[partyname.length];
    }

    void count(int partynumber) {
        if (partynumber <= 0 || partynumber > partyname.length) {//เลขผิด 
            System.out.println("invalid number");
        } else {
            partyScore[partynumber - 1]++; //เพิ่มคะแนน
            if (max <= partyScore[partynumber - 1]) {
                max = partyScore[partynumber - 1];
            }
            System.out.println(partyname[partynumber - 1] + " " + partyScore[partynumber - 1]);
        }
    }

    void printinfo() {
        for (int i = 0; i < partyname.length; i++) {
            System.out.println((i + 1) + " " + partyname[i] + " " + partyScore[i]);
        }
    }

    void printMax() {
        for (int i = 0; i < partyname.length ; i++) {
            if (partyScore[i] == max) {
                System.out.println((i + 1) + " " + partyname[i] + " " + partyScore[i]);
            }
        }
    }
}
