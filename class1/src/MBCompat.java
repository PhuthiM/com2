
import java.util.Scanner;

public class MBCompat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int speed = sc.nextInt();
        int typesocket = sc.nextInt();
        int typeram = sc.nextInt();

        sc.nextLine();
        String Mname = sc.nextLine();
        int Mtypesocket = sc.nextInt();
        int Mtyperam = sc.nextInt();
        if (model.length() == 0 && typesocket % 2 == 0) {
            model = null;
        }
        if (Mname.length() == 0 && typesocket % 2 == 0) {
            Mname = null;
        }
        MainBoard mainboard = new MainBoard(Mname, Mtypesocket, Mtyperam);
        CPU cpu = new CPU(model, speed, typesocket, typeram);
        Computer com = new Computer(mainboard, cpu);
        com.printInfo();
    }
}

final class Computer {

    MainBoard mainboard;
    CPU cpu;
    boolean valid;

    public Computer(MainBoard mainboard, CPU cpu) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        valid = isValidCom(mainboard, cpu);
    }

    boolean isValidCom(MainBoard mainboard, CPU cpu) {
        return mainboard.typesocket == cpu.typesocket && mainboard.typeram == cpu.typeram && mainboard.valid == true && cpu.valid == true;
    }

    void printInfo() {
        if (valid) {
            System.out.println(cpu.model);
            System.out.println(cpu.speed);
            System.out.println(mainboard.model);
            System.out.println(mainboard.typesocket);
            System.out.println(cpu.typeram);

        } else {
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mainboard.printInfo();
        }

    }
}

final class MainBoard {

    String model;
    int typesocket;
    int typeram;
    boolean valid;

    public MainBoard(String model, int typesocket, int typeram) {
        this.model = model;
        this.typesocket = typesocket;
        this.typeram = typeram;
        this.valid = isValidSpec(model, typesocket, typeram);
    }

    boolean isValidSpec(String model, int typesocket, int typeram) {
        if (model == null) {
            return false;
        } else if (model.length() == 0) {
            return false;
        } else if (typesocket <= 0) {
            return false;
        } else if (typeram <= 0 || typeram > 10) {
            return false;
        } else {
            return true;
        }
    }

    void printInfo() {
        System.out.println(model);
        System.out.println(typesocket);
        System.out.println(typeram);
        System.out.println(valid);
    }
}

//final class CPU {

    String model;
    int speed;
    int typesocket;
    int typeram;
    boolean valid;

    public CPU(String model, int speed, int typesocket, int typeram) {
        this.model = model;
        this.speed = speed;
        this.typesocket = typesocket;
        this.typeram = typeram;
        this.valid = isValidSpec(model, speed, typesocket, typeram);
    }

    boolean isValidSpec(String model, int speed, int typesocket, int typeram) {
        if (model == null) {
            return false;
        } else if (model.length() == 0) {
            return false;
        } else if (speed <= 0) {
            return false;
        } else if (typesocket <= 0) {
            return false;
        } else if (typeram <= 0 || typeram > 10) {
            return false;
        } else {
            return true;
        }
    }

    void printInfo() {
        System.out.println(model);
        System.out.println(speed);
        System.out.println(typesocket);
        System.out.println(typeram);
        System.out.println(valid);
    }
}
