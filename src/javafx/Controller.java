package javafx;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {

    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextField txtAddress;

    public Text tFullName;
    public Text tEmail;
    public Text tAge;
    public Text tAddress;

    public Text nFullName;
    public Text nEmail;
    public Text nAge;
    public Text nAddress;

    public TextField txtName;
    public TextField txtPhoneNumber;
    public ListView<PhoneNumber> lv;

    public Text nName;
    public Text nPhoneNumber;

    public void handleSubmit(){
        String fn = txtFullName.getText();
        if(fn.isEmpty()){
            nFullName.setText("Nhap ho ten");
            nFullName.setVisible(true);
        }else{
            tFullName.setText(fn);
            nFullName.setVisible(false);
        }

        String em = txtEmail.getText();
        if(em.isEmpty() || !em.contains("@") || em.startsWith("@") || em.endsWith("@")){
            nEmail.setText("Nhap lai email");
            nEmail.setVisible(true);
        }else {
            tEmail.setText(em);
            nEmail.setVisible(false);
        }

        String a = txtAge.getText();
        try{
            Integer iAge = Integer.parseInt(a);
            if(iAge<0 || iAge >100)
                throw new Exception("Nhap lai tuoi");
            tAge.setText(a);
            nAge.setVisible(false);
        }catch (Exception e){
            nAge.setText(e.getMessage());
            nAge.setVisible(true);
        }


        String ad = txtAddress.getText();
        if(ad.isEmpty()){
            nAddress.setText("Nhap dia chi");
            nAddress.setVisible(true);
        }else {
            tAddress.setText(ad);
            nAddress.setVisible(false);
        }
    }

    private ObservableList<PhoneNumber> phoneList = FXCollections.observableArrayList();

    public void addPhone(){
        try{
            nName.setVisible(false);
            nPhoneNumber.setVisible(false);
            if(txtName.getText().isEmpty() || txtPhoneNumber.getText().isEmpty()){
                throw new Exception("Nhap day du thong tin");
            }
           // phoneList.add(new PhoneNumber(txtName.getText(),txtPhoneNumber.getText()));
            updatePhone();
            printContact();
        }catch (Exception e){
            nName.setText(e.getMessage());
            nName.setVisible(true);
            nPhoneNumber.setText(e.getMessage());
            nPhoneNumber.setVisible(true);
        }

    }

    public void updatePhone(){
        for(PhoneNumber p:phoneList){
            if(p.getName().equals(txtName.getText())){
                if(!p.getPhone().equals(txtPhoneNumber.getText())){
                    p.setPhone(txtPhoneNumber.getText());
                    return;
                }
                return;
            }
        }
        phoneList.add(new PhoneNumber(txtName.getText(),txtPhoneNumber.getText()));
    }

    public void printContact(){

        lv.setItems(phoneList);
        lv.refresh();
    }


}
