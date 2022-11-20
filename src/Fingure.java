import java.util.Scanner;

public class Fingure {
    private int id;
    private String name;
    private String position;
    public static int Auto_Id = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Fingure{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
    public void inputTable(){
        this.id = Auto_Id;
        Auto_Id++;
        System.out.println("Nhập tên anh hùng: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập vị trí: ");
        this.position = new Scanner(System.in).nextLine();
    }
}
