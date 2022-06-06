import java.util.Scanner;
public class MakeCookie {
    static void calCookieBags(int powder, int noey) {
        int cookie = 0;
        int Flour = 0;
        int Butter = 0;
        if (powder < 0 || powder >= 100000) {
            cookie = -1;
            powder = -1;
        }
        if (noey < 0 || noey >= 100000) {
            cookie = -1;
            noey = -1;
        } else if (powder >= 0 & noey >= 0 && powder <= 100000 && noey <= 100000) {
            Flour = powder / 6;
            Butter = noey / 3;
            if (Flour < Butter) {
                cookie = Flour;
            } else {
                cookie = Butter;
            }
            powder -= (cookie * 6);
            noey -= (cookie * 3);
        }
        if (cookie == -1) {
            System.out.println("Cookie bags: Error");
        } else {
            System.out.println("Cookie bags: " + cookie);
        }
        if (powder == -1) {
            System.out.println("Flour left: Invalid");
        } else {
            System.out.println("Flour left: " + powder);
        }
        if (noey == -1) {
            System.out.println("Butter left: Invalid");
        } else {
            System.out.println("Butter left: " + noey);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flour = scan.nextInt();
        int butter = scan.nextInt();
        // Call the method with parameters
        calCookieBags(flour, butter);
    }

}
