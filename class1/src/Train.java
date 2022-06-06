
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        Carriage[] carriage = new Carriage[N + 1];
        for (int i = 1; i <= N; i++) {
            int type = scan.nextInt();
            int capa = scan.nextInt();
            int id = scan.nextInt();
            carriage[i] = new Carriage(capa, type, id);
        }

        final int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            carriage[p].reserveSeats(q);
        }
        for (int i = 1; i <= N; i++) {
            carriage[i].printStats();
        }

    }

}

class Carriage {

    int countSeat, type, id;
    int reserveSit;
    int reserveStand;
    int countStand;

    public Carriage(int countSeat, int type, int id) {
        this.countSeat = countSeat;
        this.type = type;
        this.id = id;
        if (type == 3) {
            this.countStand = 10;
        }
    }

    void reserveSeats(int nReserve) {
        if (reserveSit + nReserve <= countSeat) {
            reserveSit = reserveSit + nReserve;
        }
    }

    void printStats() {
        if (type == 1 || type == 2) {
            System.out.println(id + " " + type + " " + reserveSit + " " + countSeat);
        } else if (type == 3) {
            int nSeat = this.countSeat - countStand;
            int nReserve = this.countSeat;
            if (countSeat > nSeat) {
                nReserve = nSeat;
                reserveStand = this.countSeat - nSeat;
            }
            System.out.println(id + " " + type + " " + reserveSit + " " + countSeat + " " + reserveStand + " " + countStand);
        }
    }
}
