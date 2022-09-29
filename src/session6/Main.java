package session6;

public class Main {
    public static void  main (String[] args) {
        try {
            int x = 10;
            int y = 0;
            if(y==0){
                throw new ArithmeticException();
            }
            System.out.println(x + ":" + y + "=");
            int z = x / y;
            System.out.println(z);
        }catch (NullPointerException n){
            // ngoai le chua cap o nho cho bien
            System.out.println("Null....");
        } catch (ArithmeticException ae) {
            // ngoai le ve tinh toan
            System.out.println("Sai so");

        }catch (Exception e){
            // ngoai le tong hop, chi chay vao 1 catch duy nhat
           System.out.println("Err");
       }finally {
            // luc nao cung chay vao day
        }
    }
}
