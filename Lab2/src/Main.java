import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Nhập số học sinh muốn thêm: ");
        while (true){
            try {
                int num = new Scanner(System.in).nextInt();
                for (int i = 0; i < num; i++) {
                    Student student = new Student();
                    student.inputTable();
                    students.add(student);
                }
                System.out.println(students);
                double perCentA = (Student.countA / num) * 100;
                double perCentB = (Student.countB / num) * 100;
                double perCentC = (Student.countC / num) * 100;
                System.out.println("Phần trăm loại A: " + perCentA + " Phần trăm loại B: " + perCentB + " Phần trăm loại C: " + perCentC);
                break;
            }
            catch (Exception e){
                System.out.println("Phải là số, hãy nhập lại");
            }
        }
    }
}