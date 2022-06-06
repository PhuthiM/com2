
import java.util.Scanner;

public class ShootingString2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char a = A.charAt(0);
        int sum1 = 0;
        int result1 = 0;
        int count1 = 0;
        for (;;) {
            String word = sc.next();
            if (word.equals("Z")) {
                sum1 /= 5;
                break;
            } else {
                sum1 += word.length();
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == a) {
                        count1++;
                    }
                }
            }
        }

        String B = sc.next();
        char b = B.charAt(0);
        int sum2 = 0;
        int result2 = 0;
        int count2 = 0;
        for (;;) {
            String word = sc.next();
            if (word.equals("Z")) {
                sum2 /= 5;
                break;
            } else {
                sum2 += word.length();
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == b) {
                        count2++;
                       
                    }
                }
            }
        }
        //   System.out.println(count2);
        result1 = sum2 + count1;
        result2 = sum1 + count2;
        System.out.println(count1 + " " + sum2 + " " + result1);
        System.out.println(count2 + " " + sum1 + " " + result2);
        if (result1 > result2) {
            System.out.println("1");
        } else if (result2 > result1) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }  
    }
}
