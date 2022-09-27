package assignment3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }


    @Override
    public void insertPhone(String name, String phone) {
        PhoneNumber p = new PhoneNumber();
        p.setName(name);
        p.phone.add(phone);

        for (PhoneNumber pl : phoneList) {

            if (pl.name.equals(p.name)) {


                if (!pl.phone.contains(phone)) {
                    pl.phone.add(phone);
                } else {
                    System.out.println("Da Co nguoi ten " + name + " co so dien thoai " + phone);
                }

            }
        }

        phoneList.add(p);
    }


    @Override
    public void removePhone(String name) {


        for (PhoneNumber pl : phoneList) {
            if (pl.name.equals(name)) {

                phoneList.remove(pl);
                System.out.println("da xoa: " + name);
                return;
            }
        }

        System.out.println("Khong tim thay nguoi nao ten: " + name);

    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber pl : phoneList) {
            if (pl.name.equals(name)) {
                pl.phone.remove(oldPhone);
                pl.phone.add(newPhone);
                System.out.println("Danh ba ten: " + name + " da thay so dt:" + oldPhone + " bang so dt: " + newPhone);
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {

        for (PhoneNumber pl : phoneList) {
            if (pl.name.equals(name)) {

                return pl;
            }
        }

        System.out.println("Khong co nguoi ten: " + name + " trong danh ba");
        return null;
    }

    @Override
    public void sort() {
    Collections.sort(phoneList, new Comparator<PhoneNumber>() {
        @Override
        public int compare(PhoneNumber o1, PhoneNumber o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    }
}



