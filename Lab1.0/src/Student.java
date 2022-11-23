import java.util.Scanner;

public class Student {
    private String name;
    private String address;
    private int age;
    private int id;
    public static int AutoId = 100;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return AutoId;
    }

    public static void setAutoId(int autoId) {
        AutoId = autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public void inputTable(){
        this.id = AutoId;
        AutoId++;
        while (true){
            try {
                System.out.println("Nhập tên: ");
                this.name = new Scanner(System.in).nextLine();
                System.out.println("Nhập địa chỉ: ");
                this.address = new Scanner(System.in).nextLine();
                System.out.println("Nhập tuổi: ");
                this.age = new Scanner(System.in).nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Không hợp lệ, hãy nhập lại.");
            }
        }
    }
}
