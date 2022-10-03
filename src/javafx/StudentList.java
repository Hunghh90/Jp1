package javafx;

public class StudentList {

    public String fullName;
    public String email;
    public String mark;

    public StudentList(String fullName, String email, String mark) {
        this.fullName = fullName;
        this.email = email;
        this.mark = mark;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String toString(){
        return getFullName()+getEmail()+getMark()+"\n";
    }
}
