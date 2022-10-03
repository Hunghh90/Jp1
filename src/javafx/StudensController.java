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
    public TextField txtEmail;
    public TextField txtMark;
    public ListView<StudentList> studentList;


    public Text errors;


    private ObservableList<StudentList> studentLists = FXCollections.observableArrayList();

    public void addStudent(){
        try{

            Integer iMark = Integer.parseInt(txtMark.getText());
            if(txtFullName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtMark.getText().isEmpty() || !txtEmail.getText().contains("@") || !txtEmail.getText().startsWith("@") || !txtEmail.getText().endsWith("@") || iMark<0 || iMark >10){
                throw new Exception("Nhap thong tin day du va chinh xac");
                errors.setVisible(true);
            }
            // phoneList.add(new PhoneNumber(txtName.getText(),txtPhoneNumber.getText()));
            updateStudent();
            printStudent();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(false);

        }

    }
    public void updateStudent(){
        for(StudentList st : studentLists){
            if(st.getFullName().equals(txtFullName.getText())){
                if(st.getEmail().equals(txtEmail.getText())){
                    st.setEmail(txtEmail.getText());
                    return;
                }
                return;
            }
        }
        studentLists.add(new StudentList(txtFullName.getText(),txtEmail.getText(),txtMark.getText()));
    }

    public void printStudent(){
        studentList.setItems(studentLists);
        studentList.refresh();
    }

//    public void sortName(){
//        boolean sn = true ;
//        if (sn) {
//            Collections.sort(studentLists, new Comparator<StudentList>() {
//                @Override
//                public int compare(StudentList o1, StudentList o2) {
//                        return o1.getFullName().compareTo(o2.getFullName());
//                    studentList.refresh();
//                }
//            });
//        } else {
//            Collections.sort(studentLists, new Comparator<StudentList>() {
//                @Override
//                public int compare(StudentList o1, StudentList o2) {
//                    return o1.getFullName().compareTo(o2.getFullName());
//                    studentList.refresh();
//                }
//            });
//
//        }
//    }
//
//    public void sortMark(){
//
//    }

}
