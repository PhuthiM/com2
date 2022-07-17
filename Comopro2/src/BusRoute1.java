/*
import java.util.Scanner;

public class BusRoute1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        for (int i = 0; i < N; i++) {
            names[i] = scan.next();
            distances[ i] = scan.nextInt();
        }
        Route route  = new Route(names, distances); // Create a Route object here.
        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int number = scan.nextInt();
             route.getStopInfo(number);
        }
    }
}

class Route {

    String[] nameStation;
    int[] distance;

    public Route(String[] nameStation, int[] distance) {
        this.nameStation = nameStation;
        this.distance = distance;
    }

    void getStopInfo(int number) {
        if (number > 0 && number <= distance.length) {
            System.out.println(nameStation[number - 1] + " " + distance[number - 1]);
        } else {
            System.out.println("invalid number");
        }
    }
}
