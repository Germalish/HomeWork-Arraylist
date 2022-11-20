import java.util.ArrayList;
import java.util.Scanner;

public class Idol {
    private String name;
    private int id;
    private String email;
    private ArrayList<Follower> followers;
    private String group;
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

    public ArrayList getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }




    public void nhapThongTin() {
        this.id = AutoId;
        AutoId++;
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập email: ");
        this.email = new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng followers: ");
        int num = new Scanner(System.in).nextInt();
        ArrayList<Follower> followers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Follower follower = new Follower();
            follower.nhapThongTin();
            followers.add(follower);
        }
        this.followers=followers;
        System.out.println("Nhập tên nhóm: ");
        this.group = new Scanner(System.in).nextLine();
    }
}