
import java.util.Scanner;

public class BusRoute3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        for (int i = 0; i < N; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route route = new Route(names, distances); // Create a Route object here.
        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            int upbus = scan.nextInt();
            int downbue = scan.nextInt();
            route.getTripInfo(upbus, downbue);
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

    void summarizeRoute() {
        int sum = 0;
        System.out.print(nameStation[0] + " " + nameStation[nameStation.length - 1]);
        for (int i = 0; i < nameStation.length; i++) {
            sum += distance[i];
        }
        System.out.println(" " + sum);
    }

    void getTripInfo(int upBus, int downBus) {
        int upbus = upBus - 1;
        int downbus = downBus - 1;
        if (upbus > downbus || upbus >= nameStation.length || downbus >= nameStation.length || upbus < 0 || downbus < 0) {
            System.out.println("invalid number");
        } else {
            int sum = 0;
            System.out.print(nameStation[upbus] + " " + nameStation[downbus]);
            for (int i = upbus + 1; i <= downbus; i++) {
                sum += distance[i];
            }
            System.out.println(" " + sum);
        }
    }
}
