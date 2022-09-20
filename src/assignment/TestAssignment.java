package assignment;

import java.util.Scanner;

public class TestAssignment {
    public static void main(String[] args){
        Account myAccount = new Account(1,"hung",100000);
        Account testAccount = new Account(2,"Thai",50000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So TIen Muon Rut:");
        int x = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rut THanh Cong "+x);
        }else{
            System.out.println("Rut Khong THanh Cong");
        }

        System.out.println("Nhap So TIen Muon chuyen:");
        int y = sc.nextInt();
        if(myAccount.tranferTo(testAccount,y)){
            System.out.println("Chuyen khoan thanh cong "+y+ " Sang tai khoan "+testAccount.getName());
        }else {
            System.out.println("Chuyen khoan that bai");
        }
        System.out.println("So du tai khoan: "+myAccount.getBalace());
    }
}
