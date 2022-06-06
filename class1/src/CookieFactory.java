
import java.util.Scanner;

class CookiePlanner {

    int f, b;
    int flour = 0, butter = 0, bags = 0;

    public CookiePlanner(int f, int b) {
        this.f = f;
        this.b = b;
    }

    int calculate() {
        int result;
        int calF = flour / f;
        int calB = butter / b;
        if (calF > calB) {
            result = calB;
        } else {
            result = calF;
        }
        return result;
    }

    boolean produce(int wantCookie) {
        int cal = calculate();
        if (cal >= wantCookie) {
            bags += wantCookie;
            flour -= (f * wantCookie);
            butter -= (b * wantCookie);
            System.out.print(bags + " ");
            return true;
        } else {
            System.out.print("Max capacity = " + cal + " bags, but " + wantCookie + " bags requested ");
            return false;
        }
    }

    boolean addFlour(int addF) {
        if (addF <= 0) {
            System.out.print("Invalid flour quantity ");
            return false;
        } else {
            flour += addF;
            System.out.print(flour + " ");
            return true;
        }
    }

    boolean addButter(int addB) {
        if (addB <= 0) {
            System.out.print("Invalid butter quantity ");
            return false;
        } else {
            butter += addB;
            System.out.print(butter + " ");
            return true;
        }
    }

    void reportProduction() {
        System.out.println("Cookie bags: " + bags);
        System.out.println("Flour left: " + flour);
        System.out.println("Butter left: " + butter);
    }

}

public class CookieFactory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int b = sc.nextInt();
        CookiePlanner cookiePlanner = new CookiePlanner(f, b);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int a = sc.nextInt();
            switch (k) {
                case 1:
                    System.out.println(cookiePlanner.addFlour(a));
                    break;
                case 2:
                    System.out.println(cookiePlanner.addButter(a));
                    break;
                case 3:
                    System.out.println(cookiePlanner.produce(a));
                    break;
                default:
                    break;
            }
        }
        cookiePlanner.reportProduction();
    }
}
