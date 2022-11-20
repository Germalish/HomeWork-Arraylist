import java.util.Scanner;

public class Song {
    private String name;
    private int id;
    private String singer;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", singer='" + singer + '\'' +
                '}';
    }
    public void nhapThongTin(){
        this.id = AutoId;
        AutoId++;
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
    }
}
