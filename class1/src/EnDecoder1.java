
import java.util.Scanner;

public class EnDecoder1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        int[] password = new int[n];
        for (int i = 0; i < n; i++) {
            password[i] = sc.nextInt();
        }
        Encoder encoder = new Encoder(word, password);
        int k = sc.nextInt();
        String[] w = new String[k];
        for (int i = 0; i < k; i++) {
            w[i] = sc.next();
        }
        int[] pass = encoder.encodeMsg(w);
        for (int i = 0; i < pass.length; i++) {
            System.out.print(pass[i] + " "); 
        }
    }
}

class Encoder {

    String[] word;
    int[] password;

    public Encoder(String[] word, int[] password) {
        this.word = word;
        this.password = password;
    }
    private int encodeWord(String w) {
        for (int i = 0; i < word.length; i++) {
            if (w.equals(word[i])) {
                return password[i];
            }
        }
        return -1;
    }
    int[] encodeMsg(String[] w) {
        int[] array = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            int num = encodeWord(w[i]);
            array[i] = num;
        }
        return array;
    }
}
