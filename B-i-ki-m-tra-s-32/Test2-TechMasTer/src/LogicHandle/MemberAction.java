package LogicHandle;

import constain.Regex;
import entity.Bot;
import entity.Member;
import run.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class MemberAction {


    public static void quenMatKhau() {
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
        boolean isCorrectEmail = false;
        for (Member member : Main.members) {
            if (member.getEmail().equals(email)) {
                isCorrectEmail = true;

                String newPassword;
                String input;
                while (true) {
                    System.out.println("Nhập mật khẩu mới: ");
                    input = new Scanner(System.in).nextLine();
                    if (MemberAction.checkValidPassword(input)) {
                        newPassword = input;
                        break;
                    } else {
                        System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
                    }
                }
                member.setPassWord(newPassword);
                System.out.println("Đổi mật khẩu thành công");
                break;
            }
        }
        if (!isCorrectEmail) {
            System.out.println("Tài khoản không tồn tại.");
            Main.manHinhChinh();
        }
    }

    public static Member dangNhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tài khoản: ");
        String userName = sc.nextLine();
        String password;
        String input;
        while (true) {
            System.out.print("Nhập mật khẩu: ");
            input = sc.nextLine();
            if (checkValidPassword(input)) {
                password = input;
                break;
            } else {
                System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
            }
        }
        boolean isCorrectUserName = false, isCorrectPassWord = false;
        for (Member member : Main.members) {
            if (member.getUserName().equals(userName) && member.getPassWord().equals(password)) {
                isCorrectUserName = true;
                isCorrectPassWord = true;
                if (isCorrectUserName && isCorrectPassWord) {
                    System.out.println("******************* TÀI XỈU CHƠI LÀ THẮNG *******************");
                    System.out.println("Chào mừng " + member.getUserName() + ", bạn có thể thực hiện các tính năng sau:");
                    return member;
                }
            } else if (member.getUserName().equals(userName) && !member.getPassWord().equals(password)) {
                isCorrectUserName = true;
                isCorrectPassWord = false;
                System.out.println("Mật khẩu không chính xác");
                System.out.println("1.Đăng nhập lại.");
                System.out.println("2.Quên mật khẩu.");
                System.out.print("Chọn chức năng: ");
                int functionChoice = sc.nextInt();
                switch (functionChoice) {
                    case 1:
                        Main.manHinhChinh();
                        break;
                    case 2:
                        MemberAction.quenMatKhau();
                        break;
                    default:
                        System.out.println("Chức năng không hợp lệ");
                        break;
                }
                break;
            }
        }
        if ((!isCorrectUserName && !isCorrectPassWord || !isCorrectUserName && isCorrectPassWord)) {
            System.out.println("Kiểm tra lại username");
            System.out.println("Tài khoản không tồn tại, hãy đăng ký tài khoản.");
            Main.manHinhChinh();
        }
        return null;
    }


    public Member dangKy(Scanner scanner) {
        String userName;
        while (true) {
            System.out.print("Nhập tên đăng nhập: ");
            userName = scanner.nextLine();
            boolean usernameExisted = false;
            for (Member member : Main.members) {
                if (member.getUserName().equals(userName)) {
                    usernameExisted = true;
                    break;
                }
            }
            if (!usernameExisted) {
                break;
            }
            System.out.println("Tên đăng nhập đã tồn tại, hãy tạo lại");
        }


        String password;
        String input;
        while (true) {
            System.out.print("Nhập mật khẩu: ");
            input = scanner.nextLine();
            if (checkValidPassword(input)) {
                password = input;
                break;
            } else {
                System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
            }
        }


        String input1;
        String email;
        while (true) {
            boolean emailExisted = false;
            System.out.print("Nhập Email: ");
            input1 = scanner.nextLine();
            for (Member member : Main.members) {
                if (member.getEmail().equals(input1)) {
                    emailExisted = true;
                    break;
                }
            }
            if (!emailExisted) {
                break;
            }
            System.out.println("Email này đã được sử dụng, hãy thử lại.");
        }
        while (true) {
            if (checkValidEmail(input1)) {
                email = input1;
                break;
            } else {
                System.out.println("Email không hợp lệ, hãy nhập lại.");
            }
        }

        return new Member(userName, password, email);
    }

    public static boolean checkValidEmail(String email) {
        Pattern pattern = Pattern.compile(Regex.EMAIL_REGEX);
        if (pattern.matcher(email).find()) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean checkValidPassword(String password) {
        Pattern pattern = Pattern.compile(Regex.PASSWORD_REGEX_UPPER);
        Pattern pattern1 = Pattern.compile(Regex.PASSWORD_REGEX_DOWNER);
        Pattern pattern2 = Pattern.compile(Regex.PASSWORD_REGEX_DOWNER);
        Pattern pattern3 = Pattern.compile(Regex.PASSWORD_REGEX_SPECIAL);
        if (pattern.matcher(password).find() && pattern1.matcher(password).find() && pattern2.matcher(password).find() && pattern3.matcher(password).find()
                && password.length() >= 7 && password.length() <= 15) {
            return true;
        } else {
            return false;
        }

    }
    public static void napTien(Scanner scanner, Member member) {
        System.out.print("Nhập số tiền muốn nap: ");
        int money = scanner.nextInt();
        System.out.print("Điền mã giao dịch: ");
        int maGiaoDich = scanner.nextInt();
        System.out.println("Bạn đã nạp thành công: " + money + "$");
        member.setMoney(money);
    }
}
