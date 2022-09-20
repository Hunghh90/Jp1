package assignment;

public class Account {
    public int id;
    public String name;
    public double balance;

    public Account() {
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalace() {
        return balance;
    }

    public void setBalace(double balace) {
        this.balance = balace;
    }

    public boolean credit(int amount){
        if(amount <=0) return false;
        balance += amount;
        return true;
    }

    public boolean debit(int amount){
        if(amount <=0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public boolean tranferTo(Account account,int amount){
        if(amount <=0 || amount > balance) return false;
        account.balance += amount;
        balance -= amount;
        return true;
    }
}
