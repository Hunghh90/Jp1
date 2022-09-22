package assignment3;

import java.util.ArrayList;

public class PhoneBook extends Phone{

    public ArrayList<PhoneNumber> phoneList ;

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }



    @Override
    public void insertPhone(String name, String phone) {

        for(int i = 0;i<phoneList.size();i++){
                if (name.compareTo(phoneList.get(i).name) < 0 || name.compareTo(phoneList.get(i).name) > 0) {
                    phoneList.add(new PhoneNumber(name, phone));


                }}
        }


    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }
}
