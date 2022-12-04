package LogicHandle;

import entity.Bot;
import entity.Member;
import run.Main;
import view.Menu;

import java.util.*;

public class GameAction {
    public static int tongCuoc = 0;
    public static int soLanQuay = 1;

    public void inGame() {
//        Đăng nhập
        Member member = MemberAction.dangNhap();
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu.manHinhTrongGame();
            System.out.print("Chọn chức năng: ");
            int functionChoice = sc.nextInt();
            switch (functionChoice) {
                case 1:
                    xuLyKetQuaGame(sc, member);
                    break;
                case 2:
                    rutTien(sc, member);
                    break;
                case 3:
                    MemberAction.napTien(sc, member);
                    break;
                case 4:
                    bangXepHang();
                    break;
                case 5:
                    vongQuayMayMan(member);
                    break;
                case 6:
                    System.out.println(member);
                    thongTinNguoiChoi(sc, member);
                    break;
                case 7:
                    System.out.println("Bạn đã thoát game, hẹn gặp lại !");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ");
                    break;
            }
        }
    }

    private void xuLyKetQuaGame(Scanner sc, Member member) {
        while (true) {
            Menu.taiHayXiu();
            int choice = sc.nextInt();
            if (choice == 3) {
                System.out.println("Bạn đã thoát Game!");
                break;
            }
            System.out.print("Nhập tiền cược: ");
            int tienCuoc = sc.nextInt();
            if (tienCuoc < 0) {
                System.out.println("Tiền cược không được âm.");
                continue;
            } else if (tienCuoc > member.getMoney()) {
                System.out.println("Vượt số tiền bạn có, hãy nạp thêm");
                continue;
            } else if (member.getMoney() < 0) {
                System.out.println("Bạn cần phải nạp thêm tiền để chơi tiếp.");
                continue;
            } else if (tienCuoc > 0 && member.getMoney() > 0 && tienCuoc <= member.getMoney() && choice > 0 && choice < 3) {
                taiXiu(tienCuoc, choice, member);
                tongCuoc += tienCuoc;
                Member member1 = new Member(member.getUserName(), member.getTienThang());
                Main.members1.add(member1);
                if (member1.getTienThang() >= 1000) {
                }
            }
            System.out.println("Số tiền của bạn: " + member.getMoney());
        }
    }

    private void thongTinNguoiChoi(Scanner sc, Member member) {
        Menu.manHinhCaiDat();
        int choice2 = sc.nextInt();
        switch (choice2) {
            case 1:
                System.out.println("Nhập email mới: ");
                String input1;
                String email;
                while (true) {
                    System.out.print("Nhập Email: ");
                    input1 = new Scanner(System.in).nextLine();
                    if (MemberAction.checkValidEmail(input1)) {
                        email = input1;
                        break;
                    } else {
                        System.out.println("Email không hợp lệ, hãy nhập lại.");
                    }
                }
                member.setEmail(email);
                break;
            case 2:
                System.out.println("Nhập mật khẩu mới: ");
                String password1;
                String input2;
                while (true) {
                    System.out.println("Nhập mật khẩu: ");
                    input2 = new Scanner(System.in).nextLine();
                    if (MemberAction.checkValidPassword(input2)) {
                        password1 = input2;
                        break;
                    } else {
                        System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
                    }
                }
                member.setPassWord(password1);
                break;
            case 3:
                break;
        }

    }

    private void bangXepHang() {
        BotAction.botInformation();
        System.out.println("Top 10 đại gia: ");
        Collections.sort(Main.members1);
        for (int i = 0; i < 10; i++) {
            System.out.println(Main.members1.get(i));

        }
    }


    private void vongQuayMayMan(Member member) {
        System.out.println("Bạn sẽ tham gia vòng quay may mắn nếu tổng cược đạt 1000$");
        System.out.println("Chỉ áp dụng 1 lần trong ngày");
        Random random = new Random();
        int check = Main.trungThuong.get(random.nextInt(Main.trungThuong.size()));
        if (soLanQuay > 1) {
            System.out.println("Bạn đã hết lượt tham gia!");
        } else if (tongCuoc >= 1000) {
            if (check == 1) {
                System.out.println("Chúc mừng bạn đã được thưởng 10$");
                member.setMoney(member.getMoney() + 10);
                soLanQuay += 1;
            } else if (check == 2) {
                System.out.println("Chúc mừng bạn đã được thưởng 20$");
                member.setMoney(member.getMoney() + 20);
                soLanQuay += 1;
            } else {
                System.out.println("Chúc bạn may mắn lần sau");
                soLanQuay += 1;
            }
        } else {
            System.out.println("Tổng tiền cược không đủ, hãy chơi tiếp");
        }
    }

    private void rutTien(Scanner scanner, Member member) {
        System.out.print("Nhập số tiền muốn rút: ");
        int rut = scanner.nextInt();
        if (rut <= member.getMoney()) {
            member.setMoney(member.getMoney() - rut);
            System.out.println("Bạn đã rút thành công: " + rut + "$");
        } else if (rut > member.getMoney()) {
            System.out.println("Tài khoản của bạn không đủ");
        }
    }

    private void taiXiu(int tienCuoc, int choice, Member member) {
        Random random = new Random();
        int ketQua = Main.xucXac.get(random.nextInt(Main.xucXac.size()));
        if (choice == 1 && ketQua >= 11) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Chúc mừng bạn đã thắng: " + tienCuoc + "$");
            member.setMoney(member.getMoney() + tienCuoc);
            member.setTienThang(member.getTienThang() + tienCuoc);
        } else if (choice == 2 && ketQua >= 11) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Bạn đã thua: " + tienCuoc + "$");
            System.out.println("Hãy tiếp tục, còn thở còn gỡ");
            member.setMoney(member.getMoney() - tienCuoc);
            member.setTienThang(member.getTienThang() - tienCuoc);
        } else if (choice == 1 && ketQua <= 10) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Bạn đã thua: " + tienCuoc + "$");
            System.out.println("Hãy tiếp tục, còn thở còn gỡ");
            member.setMoney(member.getMoney() - tienCuoc);
            member.setTienThang(member.getTienThang() - tienCuoc);
        } else if (choice == 2 && ketQua <= 10) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Chúc mừng bạn đã thắng: " + tienCuoc + "$");
            member.setMoney(member.getMoney() + tienCuoc);
            member.setTienThang(member.getTienThang() + tienCuoc);
        }
    }
}
