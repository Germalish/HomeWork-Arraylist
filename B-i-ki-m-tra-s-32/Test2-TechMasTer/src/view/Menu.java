package view;

import LogicHandle.GameAction;
import LogicHandle.MemberAction;
import entity.Member;
import run.Main;

import java.util.Scanner;

public class Menu {
    MemberAction memberAction = new MemberAction();
    GameAction gameAction = new GameAction();
    public void startMenu(Scanner scanner) {
        System.out.println("Welcome to RikVip !");
        System.out.println("1.Đăng nhập");
        System.out.println("2.Đăng ký");
        System.out.print("Chọn: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    gameAction.inGame();
                    break;
                case 2:
                    Member member = memberAction.dangKy(scanner);
                    Main.members.add(member);
                    System.out.println(Main.members);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ");
                    break;
            }
        }catch (Exception e){
            System.out.println("Chức năng không hợp lệ");
        }
    }

    public static void manHinhCaiDat() {
        System.out.println("1.Thay đổi email.");
        System.out.println("2.Thay đổi password.");
        System.out.println("3.Thoát chế độ.");
        System.out.print("Chọn: ");
    }
    public static void manHinhTrongGame(){
        System.out.println("1.Tài xỉu.");
        System.out.println("2.Rút tiền.");
        System.out.println("3.Nạp tiền.");
        System.out.println("4.Bảng xếp hạng");
        System.out.println("5.Vòng quay may mắn.");
        System.out.println("6.Thông tin cá nhân.");
        System.out.println("7.Đăng xuất.");
        System.out.print("Choose: ");
    }
    public static void taiHayXiu(){
        System.out.println("Chúc bạn may mắn:");
        System.out.println("1.Tài          2.Xỉu         3.Thoát");
        System.out.print("Chọn: ");
    }
}
