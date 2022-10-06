package multipage.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import multipage.Main;
import multipage.Subject;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ListView<Subject> lv;

    public static ObservableList<Subject> list = FXCollections.observableArrayList();
    public static Subject editItem;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(list);
    }




    public void goToForm(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene listScene = new Scene(listPage,600,400);


        Main.rootStage.setTitle("Form");
        Main.rootStage.setScene(listScene);

    }
    public void goToEdit() throws Exception{
        editItem = lv.getSelectionModel().getSelectedItem();
        if(editItem == null) return;

        Parent listPage = FXMLLoader.load(getClass().getResource("../editsubject/form.fxml"));
        Scene listScene = new Scene(listPage,600,400);


        Main.rootStage.setTitle("Sua mon hoc");
        Main.rootStage.setScene(listScene);

    }
}
