package entity;

import java.util.Scanner;

public class Member implements Comparable<Member>{
    private String userName;
    private String passWord;
    private String email;
//    money là tiền nạp vào, tiền thắng là tiền chơi được
    private int money;
    private int tienThang;

    public Member(String username, int tienThang) {
        this.userName = username;
        this.tienThang = tienThang;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int riotPoint) {
        this.money = riotPoint;
    }

    public Member(String userName, String password, String email) {
        this.userName = userName;
        this.passWord = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTienThang() {
        return tienThang;
    }

    public void setTienThang(int tienThang) {
        this.tienThang = tienThang;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", money=" + money +
                ", tienThang=" + tienThang +
                '}';
    }

    @Override
    public int compareTo(Member o) {
        return o.getTienThang() - this.getTienThang();
    }

//    @Override
//    public int compareTo(Member o) {
//        return this.getTienThang()- o.getTienThang()>0?1:-1;
//    }
}
