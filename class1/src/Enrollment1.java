
import java.util.*;

//class Course {

    String nameSub;
    int maxStudent;
    ArrayList<Integer> enrollStudent;

    public Course(String nameSub, int maxStudent) {
        this.nameSub = nameSub;
        this.maxStudent = maxStudent;
        enrollStudent = new ArrayList<>();
    }

    boolean enroll(int idStudent) {
        boolean found = false;
        if (enrollStudent.size() == maxStudent) {
            return false;
        } else {
            for (int i = 0; i < enrollStudent.size(); i++) {
                if (idStudent == enrollStudent.get(i)) {
                    found = true;
                    return false;
                }
            }
            if (!found) {
                enrollStudent.add(idStudent);
            }
        }
        return true;
    }

    void printInfo() {
        System.out.println(nameSub + " " + enrollStudent.size());
        for (int i = 0; i < enrollStudent.size(); i++) {
            System.out.println(enrollStudent.get(i));
        }
    }

}

public class Enrollment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameSub = sc.next();
        int maxStudent = sc.nextInt();
        Course course = new Course(nameSub, maxStudent);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int id = sc.nextInt();
            System.out.println(course.enroll(id));
        }
        course.printInfo();
    }
}
