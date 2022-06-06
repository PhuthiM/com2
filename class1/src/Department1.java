
import java.util.Scanner;

public class Department1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int officer = sc.nextInt();
        int student = sc.nextInt();
        Dept dept = new Dept(officer, student);
        dept.printReport();

    }
}
class Depta {

    int officer;
    int student;
    int ministryBudget, eduFee, serviceFee, donation;

    public Dept(int officer, int student) {
        computeIncome(officer, student);
    }

    void computeIncome(int officer, int student) {
        ministryBudget = (officer * 500000) + (student * 3000);
        eduFee = student * 5000;
        serviceFee = 300000;
        donation = 100000;
    }

    void printReport() {
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
    }
}
