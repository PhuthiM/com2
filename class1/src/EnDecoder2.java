
import java.util.Scanner;

class Decoder {

    String[] word;
    int[] password;

    public Decoder(String[] word, int[] password) {
        this.word = word;
        this.password = password;
    }

    private String decodeWord(int pass) {
        for (int i = 0; i < password.length; i++) {
            if (pass == password[i]) {
                return word[i];
            }
        }
        return "?";
    }

    String decodeMsg(int[] pw) {
        String re = "";
        for (int i = 0; i < pw.length; i++) {
            re += decodeWord(pw[i]) + " ";
        }
        return re;
    }
}

public class EnDecoder2 {
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
        Decoder decoder = new Decoder(word, password);
        String decode = decoder.decodeMsg(pass);
        System.out.println(decode);
    }
}
