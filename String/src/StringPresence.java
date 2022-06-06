
import java.util.Scanner;

public class StringPresence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] substr = new String[n];
        for (int i = 0; i < n; i++) {
            substr[i] = sc.next();
        }
        String word = sc.next();
        boolean c = false;
        for (int i = 0; i < n; i++) {
            if (word.contains(substr[i])) {
                System.out.print(substr[i] + " ");
                c = true;
            } 
        }
        if(!c){
            System.out.println("none");
        }
    }
}
