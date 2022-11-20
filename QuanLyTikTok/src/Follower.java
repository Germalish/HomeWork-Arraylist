import java.util.Scanner;

public class Follower {
    private String name;
    private int id;
    private String email;
    private int numberOfLike;
    public static int AutoId = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
    public void nhapThongTin(){
        this.id = AutoId;
        AutoId++;
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập email: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng likes: ");
        this.numberOfLike = new Scanner(System.in).nextInt();
    }
}
