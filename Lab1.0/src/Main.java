import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            try {
                System.out.println("Nhập số lượng học sinh muốn thêm: ");
                int num = new Scanner(System.in).nextInt();
                for (int i = 0; i < num; i++) {
                    Student student = new Student();
                    student.inputTable();
                    students.add(student);
                }
                System.out.println("Bạn có muốn thêm tiếp không?");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = new Scanner(System.in).nextInt();
                switch (choice) {
                    case 1:
                        continue;
                    case 2:
                        System.out.println(students);
                        return;
                }
            }
            catch (Exception e){
                System.out.println("Phải là số, hãy nhập lại.");
            }
        }
    }
}