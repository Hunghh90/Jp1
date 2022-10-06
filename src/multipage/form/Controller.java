package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {


    public void backToList(ActionEvent actionEvent) throws Exception{
        Parent formPage = FXMLLoader.load(getClass().getResource("../list/listsubject.fxml"));
        Scene formScene = new Scene(formPage,600,400);


        Main.rootStage.setTitle("List");
        Main.rootStage.setScene(formScene);

    }
}
