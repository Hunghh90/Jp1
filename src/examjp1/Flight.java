package examjp1;

public class Flight {
    int number;
    String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void display(){
        if (getNumber() > 0 && !getDestination().isEmpty()) {
            System.out.println(getNumber() + "," + getDestination());
        } else{
            System.out.println(0);
        }

    }
}
