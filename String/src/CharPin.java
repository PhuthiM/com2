
import java.util.Scanner;

public class CharPin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String pin = sc.next();
        char[] cs = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == pin.charAt(0)) {
                if (word.charAt(i + 1) == pin.charAt(1)) {
                    if (word.charAt(i + 2) == pin.charAt(2)) {
                        cs[i] = word.charAt(i + 2);
                        cs[i + 2] = word.charAt(i);
                    }
                }
            }
        }
        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(cs[i]);
        }
    }
}
/*
QWRSTLJPJTSRRSTTSRNEYRSTTSRSTFPSDFQ
RST

RUBCDPWSBCDDSRGWFASBCDZXBCDASFA
BCD

QRSWFAQRSFULAJQRSFQRSGQRSQRSAFQRS
QRS
*/