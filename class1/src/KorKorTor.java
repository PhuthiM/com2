
import java.util.Scanner;

public class KorKorTor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ต้องเขียนส่วนอ่านอินพุตช่วงแรกและสร้างวัตถุเอง
        int N = sc.nextInt();
        String[] nameParty = new String[N + 1];
        int[] countParty = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            nameParty[i] = sc.next();
            countParty[i] = sc.nextInt();

        }
        Party[] party = new Party[N + 1];
        for (int i = 1; i <= N; i++) {
            party[i] = new Party(nameParty[i], countParty[i], sc);
        }
        // โค้ดส าหรับอ่านตัวทดสอบ printInfo
        final int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = sc.nextInt();
            int regionNumber = sc.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
    }

}

class Party {

    String nameParty;
    int countParty;
    String[] name;
    String[] lastname;
    int[] number;

    public Party(String nameParty, int countParty, Scanner sc) {
        this.nameParty = nameParty;
        this.countParty = countParty;
        name = new String[countParty + 1];
        lastname = new String[countParty + 1];
        number = new int[countParty + 1];
        for (int i = 1; i <= countParty; i++) {
            name[i] = sc.next();
            lastname[i] = sc.next();
            number[i] = sc.nextInt();
        }
    }

    void printInfo(int num) {
        boolean c = false;
        if (num < 0) {
            System.out.println("invalid region number");
        } else if (num == 0) {
            for (int i = 1; i <= countParty; i++) {
                System.out.print(name[i] + " ");
                System.out.print(lastname[i] + " ");
                System.out.println(number[i]);
            }
        } else {
            for (int i = 1; i <= countParty; i++) {
                if (number[i] == num) {
                    System.out.print(name[i] + " ");
                    System.out.println(lastname[i]);

                    c = true;
                }
            }
            if (!c) {
                System.out.println("none");
            }
        }
    }
}
