
import java.util.Scanner;

class CPU {

    public String model;
    public int clock;
    public int socket;
    public int memtype;
    boolean valid;

    public CPU(String model, int clock, int socket, int memtype) {
        this.model = model;
        this.clock = clock;
        this.socket = socket;
        this.memtype = memtype;
        valid = isValidSpec(model, clock, socket, memtype);

    }

    boolean isValidSpec(String model, int clock, int socket, int memtype) {
        if (model == null || model.length() == 0) {
            return false;
        } else if (clock <= 0) {
            return false;
        } else if (socket <= 0) {
            return false;
        } else if (memtype <= 0 || memtype > 10) {
            return false;
        } else {
            return true;
        }

    }

    void printInfo() {
        System.out.println(model);
        System.out.println(clock);
        System.out.println(socket);
        System.out.println(memtype);
        if (valid == true) {
            System.out.println("true");
        } else if (valid == false) {
            System.out.println("false");
        }
    }
}

public class ComSpec {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String model = scan.nextLine();
        int clock = scan.nextInt();
        int socket = scan.nextInt();
        int memtype = scan.nextInt();
        MainBoard m=new MainBoard(model, socket, memtype);
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clock, socket, memtype);
        cpu.printInfo();
    }
}
