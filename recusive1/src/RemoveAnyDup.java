
import java.util.Scanner;

public class RemoveAnyDup {

    String removeAnyDup(String str) {
        int n = str.length();
        if (n == 0) {
            return "";
        }
        char c = str.charAt(n - 1); // ตัวสุดท้ายของสตริงนั้นๆ
        int i = str.indexOf(c);

        if (i == n - 1) {
            return removeAnyDup(str.substring(0, n - 1)) + c ;
        } else {
            return removeAnyDup(str.substring(0, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
    }
}
