package assignment4;

public class Main {
    public static void main(String[] args){
        News n = new News(1,"Tien o dau ra","30/09","Ha Hoang Hung","Lam Giau Khong Kho");
        n.rateList[0] = 1;
        n.rateList[1] = 3;
        n.rateList[2] = 2;
        n.Calculate();
        n.Display();
    }
}
