import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin Idols: ");
        System.out.println("Số lượng Idol muốn thêm: ");
        int numIdol = new Scanner(System.in).nextInt();
        ArrayList<Idol> idols = new ArrayList<>();
        for (int i = 0; i < numIdol; i++) {
            Idol idol = new Idol();
            idol.nhapThongTin();
            idols.add(idol);
        }
        System.out.println("Số lượng bài hát muốn thêm: ");
        int numSong = new Scanner(System.in).nextInt();
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < numSong; i++) {
            Song song = new Song();
            song.nhapThongTin();
            songs.add(song);
        }
        TikTok tikTok = new TikTok(idols, songs);
        System.out.println(tikTok);
    }
}