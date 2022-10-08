package examjp1;

public class Main {
    public static void main(String[] args){

        Bank b1 = new Bank(1000,10);
        System.out.println(b1.calculateInterest());

        Flight f1 = new Flight();
        f1.display();
        Flight f2 = new Flight(2,"Ha Noi");
        f2.display();
        Flight f3 =new Flight();
        f3.destination = "3";
        f3.display();
    }
}
