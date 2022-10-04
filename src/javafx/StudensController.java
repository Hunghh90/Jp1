package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Collections;
import java.util.Comparator;

public class StudensController {

    public TextField txtFullName;
    public TextField txtEmails;
    public TextField txtMark;
    public ListView<StudentList> studentList;
    private boolean n;
    private boolean m;


    public Text errors;


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
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);

        }

    }


    public void printStudent(){
        studentList.setItems(infor);
        studentList.refresh();
    }

    public void sortName() {

            if(n == true) {
                Collections.sort(infor, new Comparator<StudentList>() {
                    @Override
                    public int compare(StudentList o1, StudentList o2) {

                        return o1.getFullName().compareTo(o2.getFullName());
                    }
                });
                n = false;
                studentList.refresh();
            }else {
                Collections.sort(infor, new Comparator<StudentList>() {
                    @Override
                    public int compare(StudentList o1, StudentList o2) {
                        return -o1.getFullName().compareTo(o2.getFullName());
                    }
                });
                n=true;
                studentList.refresh();
                    }
    }
    public void sortMark(){
        if(m == true) {
            Collections.sort(infor, new Comparator<StudentList>() {
                @Override
                public int compare(StudentList o1, StudentList o2) {
                    return o1.getMark().compareTo(o2.getMark());
                }
            });
            m = false;
            studentList.refresh();
        }else {
            Collections.sort(infor, new Comparator<StudentList>() {
                @Override
                public int compare(StudentList o1, StudentList o2) {
                    return -o1.getMark().compareTo(o2.getMark());
                }
            });
            m=true;
            studentList.refresh();
        }
    }
}
