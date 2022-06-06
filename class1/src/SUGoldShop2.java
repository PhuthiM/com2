
import java.util.Scanner;

public class SUGoldShop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double priceTong = sc.nextDouble();
        item[] item = new item[n];
        double saleweight = 0;
        double buyweight = 0;
        double saleprice = 0;
        double buyprice = 0;
        for (int i = 0; i < n; i++) {
            String sorb = sc.next();
            String torf = sc.next();
            double weight = sc.nextDouble();
            if (torf.equalsIgnoreCase("t")) {
                item[i] = new item(true, weight);
            } else if (torf.equalsIgnoreCase("f")) {
                item[i] = new item(weight);
            }
            if (sorb.equalsIgnoreCase("s")) {
                saleweight += weight;
                saleprice += item[i].saleprice(priceTong);

            } else {
                buyweight += weight;
                buyprice += item[i].buyprice(priceTong);

            }
        }
        System.out.println(saleweight + " " + saleprice);
        System.out.println(buyweight + " " + buyprice);
    }
}

//class item {

    boolean tong = false;
    double weight;

    public item(boolean tongPun, double weight) {
        this.tong = tongPun;
        this.weight = weight;
    }

    public item(double weight) {
        this.weight = weight;
    }

    double saleprice(double priceTang) {
        double saleP;
        if (tong) {
            saleP = (priceTang * weight) + (1000 * weight);
        } else {
            saleP = priceTang * weight;
        }
        return saleP;
    }

    double buyprice(double priceTang) {
        double buyP;
        if (!tong) {
            buyP = (priceTang - 100) * weight;
        } else {
            buyP = priceTang * weight * 0.98;
        }
        return buyP;
    }

    void showdetail(double priceTang) {
        if (tong) {
            System.out.print("ornament " + weight + " baht ");
        } else {
            System.out.print("bar " + weight + " baht ");
        }
    }

}
