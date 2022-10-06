package multipage;

public class Subject {
    public String code;
    public String name;
    public Integer hour;

    public Subject(String code, String name, Integer hour) {
        this.code = code;
        this.name = name;
        this.hour = hour;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public String toString(){
        return getCode()+"-"+getName()+"-"+getHour();
    }
}
