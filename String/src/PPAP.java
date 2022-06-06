
import java.util.Scanner;

public class PPAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int start = word.indexOf("GOD");
        System.out.println(start);
        int center1 = word.indexOf("PPAP");
        int center2 = word.lastIndexOf("PPAP");
        System.out.println(center1);
        int last = word.lastIndexOf("GOD");
        System.out.println(last);
        if (start < center1 && center2 < last) {
            System.out.println("safe");
        } else if (center1 == -1) {
            System.out.println("clean");
        } else if (start == -1 && last == -1) {
            System.out.println("clean");
        } else if (start > center1 || center2 > last) {
            System.out.println("danger");
        }
    }
}
