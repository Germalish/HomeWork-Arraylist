package run;

import LogicHandle.BotAction;
import LogicHandle.MemberAction;
import LogicHandle.GameAction;
import entity.Bot;
import entity.Member;
import view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Integer> trungThuong = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3));
    public static ArrayList<Integer> xucXac = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15, 16, 17, 18));
    public static ArrayList<Member> members1 = new ArrayList<>();

    public static void main(String[] args) {
       Member member = new Member("a", "Anhducnd16.", "a@gmail.com");
       members.add(member);
       manHinhChinh();
    }
    public static void manHinhChinh() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            menu.startMenu(scanner);
        }
    }
}



