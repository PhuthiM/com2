
import java.util.Scanner;

public class DivideString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String Lowercase = ""; // เก็บพิมพ์เล็ก
        String Uppercase = ""; // เก็บพิมพ์ใหญ่ 
        String numbercase = ""; // เก็บตัวเลขกับอักขระ
        for (int i = 0; i < word.length(); i++) {
            int w = word.charAt(i);
            if (w >= 'A' && w <= 'Z') {
                Uppercase += word.charAt(i);
            } else if (w >= 'a' && w <= 'z') {
                Lowercase += word.charAt(i);
            } else {
                numbercase += word.charAt(i);
            }
        }
        System.out.println(Lowercase);
        System.out.println(Uppercase);
        System.out.println(numbercase);
    }
}
