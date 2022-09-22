package assignment3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber("Hung","021456");
        PhoneNumber p2 = new PhoneNumber();
        p2.setName("Huy");




        PhoneBook fonelist = new PhoneBook();
        fonelist.phoneList.add(p1);
        fonelist.phoneList.add(p2);
        fonelist.insertPhone("long","111222");



        for(PhoneNumber pl : fonelist.phoneList){
            System.out.println(pl.name);
            System.out.println(pl.phone);
        }

    }
}
