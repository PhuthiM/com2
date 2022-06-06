
import java.util.Scanner;

final class Dept {

    int income;
    int expense;
    int officer;
    int student;
    int ministryBudget, eduFee, serviceFee, donation;
    int salary, elec, eduCost;

    public Dept(int officer, int student) {
        income = computeIncome(officer, student);
        expense = computeExpense(officer, student);
        System.out.println("total income = " + income);
        System.out.println("total expense = " + expense);
        System.out.println("income - expense = " + (income - expense));
    }

    int computeIncome(int officer, int student) {
        ministryBudget = (officer * 500000) + (student * 3000);
        eduFee = student * 5000;
        serviceFee = 300000;
        donation = 100000;
        return ministryBudget + eduFee + serviceFee + donation;
    }

    int computeExpense(int officer, int student) {
        salary = officer * 600000;
        elec = (officer + student) * 2000;
        eduCost = student * 4000;
        return salary + elec + eduCost;
    }

    void printReport() {
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}

public class Department2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int officer = sc.nextInt();
        int student = sc.nextInt();
        Dept dept = new Dept(officer, student);
        dept.printReport();
    }
}
