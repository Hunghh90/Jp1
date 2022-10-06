package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import multipage.Main;
import multipage.Subject;

import java.awt.*;

public class Controller {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtHours;


    public void backToList(ActionEvent actionEvent) throws Exception{
        Parent formPage = FXMLLoader.load(getClass().getResource("../list/listsubject.fxml"));
        Scene formScene = new Scene(formPage,600,400);


        Main.rootStage.setTitle("List");
        Main.rootStage.setScene(formScene);

    }
    public void submit(){
        try{
            int hours = Integer.parseInt(txtHours.getText());
            if(txtCode.getText().isEmpty() || txtName.getText().isEmpty() || hours < 0){
                throw new Exception("Vui Long Nhap Du Lieu");
            }
            for(Subject s : multipage.list.Controller.list){
                if(s.getCode().equals(txtCode.getText()))
                    throw new Exception("Vui Long Nhap Du Lieu");
            }
            multipage.list.Controller.list.add(new Subject(txtCode.getText(),txtName.getText(),hours));
            backToList(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
