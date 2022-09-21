package session3;

public class BullDog extends Dog{

    public BullDog(int id, String name, int year) {
        super(id, name, year);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eat !!!");
    }
}
