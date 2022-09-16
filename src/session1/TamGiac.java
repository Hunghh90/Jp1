package session1;

public class TamGiac {
    int c1;
    int c2;
    int c3;

    public TamGiac() {
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    public boolean ktTamGiac(){
        return c1+c2>c3 && c1+c3>c2 && c3+c2>c1;
    }

    public int chuVi(){
        if(! ktTamGiac()) return 0;
        return c1 + c2 +c3;
    }
    public double dienTich(){
        if(! ktTamGiac()) return 0;
        double cv = chuVi()/2.0;
       return Math.sqrt(cv*(cv-c1)*(cv-c2)*(cv-c3));
    }
}
