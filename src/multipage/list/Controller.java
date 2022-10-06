package multipage.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import multipage.Main;

public class Controller {


    public void goToForm(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene listScene = new Scene(listPage,600,400);


        Main.rootStage.setTitle("Form");
        Main.rootStage.setScene(listScene);

    }
}
