package examjp1;

public class Bank {
    double balance;
    double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest(){
        double interest;
        interest = balance * (rate/1200);
        return interest;
    }

}
