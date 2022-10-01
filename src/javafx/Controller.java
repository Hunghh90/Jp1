package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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



}
