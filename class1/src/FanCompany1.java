
import java.util.Scanner;


public class FanCompany1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number = sc.nextInt();
        int angle = sc.nextInt();
        double hp = sc.nextDouble();
        Blade blade = new Blade(size, number, angle, hp);
        blade.printInfo();
    }
}
