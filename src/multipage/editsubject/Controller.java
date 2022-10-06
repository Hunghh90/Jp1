package multipage.editsubject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import multipage.Main;
import multipage.Subject;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            if (multipage.list.Controller.editItem == null)
                backToList(null);
            txtCode.setText(multipage.list.Controller.editItem.getCode());
            txtName.setText(multipage.list.Controller.editItem.getName());
            txtHours.setText(multipage.list.Controller.editItem.getHour().toString());
            txtCode.setEditable(false);
        }catch (Exception e){

        }
    }

    public void backToList(ActionEvent actionEvent) throws Exception{
        Parent formPage = FXMLLoader.load(getClass().getResource("../list/listsubject.fxml"));
        Scene formScene = new Scene(formPage,600,400);


        Main.rootStage.setTitle("List");
        Main.rootStage.setScene(formScene);

    }
    public void submit(){
        try {
            int hours = Integer.parseInt(txtHours.getText());
            if(txtName.getText().isEmpty() || hours < 0)
                throw new Exception("Nhap dung du lieu");
            multipage.list.Controller.editItem.setName(txtName.getText());
            multipage.list.Controller.editItem.setHour(hours);
            backToList(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}