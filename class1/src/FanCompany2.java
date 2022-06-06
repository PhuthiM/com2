
import java.util.Scanner;

public class FanCompany2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double i = sc.nextDouble();
        double eff = sc.nextDouble();
        Motor motor = new Motor(v, i, eff);

        motor.printInfo();
    }

}
