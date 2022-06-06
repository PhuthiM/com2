
import java.util.*;

public class Enrollment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        Student[] student = new Student[p];
        for (int i = 0; i < p; i++) {
            int id = sc.nextInt();
            String nameSudent = sc.next();
            String lastSudent = sc.next();
            student[i] = new Student(id, nameSudent, lastSudent);
        }
        String nameSub = sc.next();
        int maxStudent = sc.nextInt();
        Course course = new Course(nameSub, maxStudent);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int idStudent = sc.nextInt();
            boolean co = course.enroll(idStudent, student);
            System.out.println(co);
        }
        course.printInfo();
    }
}

class Student {

    int idStudent;
    String nameStudent, lastStudent;

    public Student(int idStudent, String nameStudent, String lastStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.lastStudent = lastStudent;
    }

    void printInfo() {
        System.out.println(idStudent + " " + nameStudent + " " + lastStudent);
    }
}

class Course {

    String nameSub;
    int maxStudent;
    ArrayList<Integer> enrollStudent;

    public Course(String nameSub, int maxStudent) {
        this.nameSub = nameSub;
        this.maxStudent = maxStudent;
        enrollStudent = new ArrayList<>();
    }

    boolean enroll(int idStudent, Student[] student) {
        boolean found = false;
        boolean have = false;
        for (int j = 0; j < student.length; j++) {
            if (idStudent == student[j].idStudent) {
                have = true;
                break;
            }
        }
        if (!have) {
            System.out.print("Invalid ID ");
            return false;
        }
        if (enrollStudent.size() == maxStudent) {
            return false;
        }
        for (int i = 0; i < enrollStudent.size(); i++) {
            if (idStudent == enrollStudent.get(i)) {
                found = true;
                return false;
            }
        }
        for (int i = 0; i < student.length; i++) {
            if (idStudent == student[i].idStudent && !found) {
                enrollStudent.add(idStudent);
                System.out.print(student[i].nameStudent + " " + student[i].lastStudent + " ");
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
/*

6
578 Jon Snow
1755 Sansa Stark
22 Arya Stark
27 Robb Stark
1759 Eddark Stark
29 Tyrion Lannister
CreativeSilpakorn
3 11
578
1756
578
578
1756
22
25
578
29
1755
1756
 */
