package entity;

import java.util.Collections;

public class Bot extends Member  {
    public Bot(String username, int tienThang) {
        super(username, tienThang);
    }

    @Override
    public String toString() {
        return "Bot{" +
                "username='" + super.getUserName() + '\'' +
                ", tienThang=" + super.getTienThang()
                +
                '}';
    }

}
