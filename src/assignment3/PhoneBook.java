package assignment3;

import java.util.ArrayList;

public class PhoneBook extends Phone{

    public ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }



    @Override
    public void insertPhone(String name, String phone) {
        PhoneNumber p = new PhoneNumber();
        p.setName(name);
        p.phone.add(phone);
        boolean timThay =false;
        for(PhoneNumber pl : phoneList){

                if (pl.name.contains(p.name)) {
                    timThay = true;

                    if (!pl.phone.contains(phone)) {
                        pl.phone.add(phone);
                    } else {
                        System.out.println("Da Co nguoi ten "+name+" co so dien thoai "+phone);
                    }

            }
        }
        if(!timThay)
            phoneList.add(p);
    }


    @Override
    public void removePhone(String name) {

    boolean search = false;
    for(PhoneNumber pl : phoneList){
        if(pl.name.contains(name)){
            search = true;
            phoneList.remove(pl);
            System.out.println("da xoa: "+name);
            break;
         }
     }
    if(!search)
        System.out.println("Khong tim thay nguoi nao ten: "+name);

    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber pl : phoneList){
            if(pl.name.contains(name)){
                pl.phone.remove(oldPhone);
                pl.phone.add(newPhone);
                System.out.println("Danh ba ten: "+name+" da thay so dt:" +oldPhone+" bang so dt: "+newPhone);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean seachr = false;
        for(PhoneNumber pl : phoneList){
            if(pl.name.contains(name)) {
                seachr = true;
                System.out.println("ten: "+pl.name+" SDT: "+pl.phone);
            }
        }
        if(!seachr)
            System.out.println("Khong co nguoi ten: "+name+" trong danh ba");
    }

    @Override
    public void sort() {

    }
}
