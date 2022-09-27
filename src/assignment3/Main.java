package assignment3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    PhoneNumber p = new PhoneNumber();
    p.setName("Huy");
    p.phone.add("123456");



        PhoneBook fonelist = new PhoneBook();
       fonelist.insertPhone("hung","123121");
       fonelist.insertPhone("hung","345678");
       fonelist.insertPhone("Hung","345678");
       fonelist.insertPhone("long","0255678");
        for(int i = 0;i<fonelist.phoneList.size();i++){
            System.out.println(fonelist.phoneList.get(i).name);
            System.out.println(fonelist.phoneList.get(i).phone);
        }

        for(int i = 0;i<fonelist.phoneList.size();i++){
            System.out.println(fonelist.phoneList.get(i).name);
            System.out.println(fonelist.phoneList.get(i).phone);
        }
        fonelist.removePhone("hung");
        fonelist.updatePhone("long","0255678","325468");
        for(int i = 0;i<fonelist.phoneList.size();i++){
                System.out.println(fonelist.phoneList.get(i).name);
                System.out.println(fonelist.phoneList.get(i).phone);
            }
        fonelist.searchPhone("long");


        }
}
