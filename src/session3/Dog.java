package session3;
//extends dung de ke thua voi dieu kien class k phai final
public class Dog extends Animal{
    public int year;

    public Dog(int id, String name, int year) {
        super(id, name);
        this.year = year;
    }



    public void eat(){
        System.out.println("Eat...");
    }
}
