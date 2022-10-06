package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class StudensController implements Initializable {

    public TextField txtFullName;
    public TextField txtEmails;
    public TextField txtMark;
    public ListView<StudentList> studentList;
    private boolean n = true;
    private boolean m = true;


    public Text errors;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        infor.add(new StudentList("Ha Hoang Hung","hungbkvn9x1@gmail.com","10"));
        infor.add(new StudentList("Tran Van Thanh","thanhngu@gmail.com","1"));
        studentList.setItems(infor);
    }

    private ObservableList<StudentList> infor = FXCollections.observableArrayList();
    public void addStudent(){
        String mark = txtMark.getText();
        try{
            errors.setVisible(false);
            Integer iMark = Integer.parseInt(mark);
            if(txtFullName.getText().isEmpty() || txtEmails.getText().isEmpty() || txtMark.getText().isEmpty() || !txtEmails.getText().contains("@") || txtEmails.getText().startsWith("@") || txtEmails.getText().endsWith("@") || iMark<0 || iMark>10){
                throw new Exception("Nhap thong tin day du va chinh xac");
            }

            infor.add(new StudentList(txtFullName.getText(),txtEmails.getText(),txtMark.getText()));
            printStudent();
            clearInput();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);

        }

    }
    public void clearInput(){
        txtFullName.setText("");
        txtEmails.setText("");
        txtMark.setText("");
    }


    public void printStudent(){
        studentList.setItems(infor);
        studentList.refresh();
    }

    public void sortName() {


                Collections.sort(infor, new Comparator<StudentList>() {
                    @Override
                    public int compare(StudentList o1, StudentList o2) {

                        return n?o1.getFullName().compareTo(o2.getFullName()):o2.getFullName().compareTo(o1.getFullName());
                    }
                });
                n = !n;
                studentList.refresh();
    }
    public void sortMark(){

            Collections.sort(infor, new Comparator<StudentList>() {
                @Override
                public int compare(StudentList o1, StudentList o2) {
                    return m?o1.getMark().compareTo(o2.getMark()):o2.getMark().compareTo(o1.getMark());
                }
            });
            m = !m;
            studentList.refresh();
    }
}
