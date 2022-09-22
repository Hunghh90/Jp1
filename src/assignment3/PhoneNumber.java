package assignment3;

import java.util.ArrayList;

public class PhoneNumber{

    String name;
    ArrayList<String> phone;

    public PhoneNumber() {
        phone=new ArrayList<String>();
    }

    public PhoneNumber(String name) {
        this.name = name;
        phone = new ArrayList<String>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }
}
