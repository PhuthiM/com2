
import java.util.Scanner;

//class Theater {

    boolean threeD;
    boolean seatRich;
    int countSeat;
    boolean[] seats;
    String title;
    int basePrice;

    public Theater(boolean threeD, boolean seatRich, int countSeat) {
        seats = new boolean[countSeat + 1];
        this.threeD = threeD;
        this.seatRich = seatRich;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    int reserveOne(int seatNumber) {
        if (seatNumber <= 0 || seatNumber > countSeat || seats[seatNumber]) {
            System.out.println("sorry");
            return -1;
        } else {
            seats[seatNumber] = true;
            return basePrice;
        }
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        int a = seatNumber + numSeats - 1;
        int rt = 0;
        if (a > countSeat || seatNumber <= 0) {
            System.out.println("sorry ");
            rt = -1;
        } else {
            for (int i = seatNumber; i <= seatNumber + numSeats - 1; i++) {
                if (seats[i] == true) {
                    System.out.println("sorry ");
                    rt = -1;
                    break;

                }
            }
            for (int i = seatNumber; i <= seatNumber + numSeats - 1; i++) {
                if (seats[i] == false) {
                    seats[i] = true;
                    rt = basePrice * numSeats;
                }

            }
        }
        return rt;
    }

    void printInfo() {
        if (threeD) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }
        if (seatRich) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }
        System.out.println(seats.length - 1);
        if (title != null && title.length() != 0) {
            System.out.println(title);
        } else {
            System.out.println("title is not set");
        }
        if (basePrice > 0) {
            System.out.println(basePrice);
        } else {
            System.out.println("price is not set");
        }
    }
}

public class Theater2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int seatRich = scan.nextInt();
        int countSeat = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1) {
            threeD = true;
        }
        if (seatRich == 1) {
            luxury = true;
        }
        Theater t = new Theater(threeD, luxury, countSeat);

        String dummy = scan.nextLine();// throw away a new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1) {
                totalPrice = t.reserveOne(seatNumber);
            } else {
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            }
            if (totalPrice > 0) {
                System.out.println(totalPrice);
            }
        }
        t.printInfo();

    }
}
