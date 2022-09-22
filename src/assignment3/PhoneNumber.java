package assignment3;

import java.util.ArrayList;

public class PhoneNumber{

    String name;
    public String phone;

    public PhoneNumber() {
    }

    public PhoneNumber(String phone) {
        this.phone = phone;
    }

    public PhoneNumber(String name,String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}