
import java.util.Scanner;

public class LowerChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String a = sc.next();
        String b = sc.next();
        char want = ' ';
        char min = ' ';
        char max = ' ';
        if (a.charAt(0) < b.charAt(0)) {
            want = a.charAt(0);
            min = a.charAt(0);
            max = b.charAt(0);
        } else {
            want = b.charAt(0);
            min = b.charAt(0);
            max = a.charAt(0);
        }

        int start = sc.nextInt();
        int last = sc.nextInt();
        for (int i = 0; i < word.length(); i++) {

            if (i >= start - 1 && i < last) {
                if (word.charAt(i) >= min && word.charAt(i) <= max) {
                    System.out.print(want);
                } else {
                    System.out.print(word.charAt(i));
                }
            }else{
                System.out.print(word.charAt(i));   
            }
          
        }
    }
}