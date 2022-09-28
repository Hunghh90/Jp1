package session5;

import session4.Human;

public class Main {
    public static void main(String[] args){
        StudentInterface s = new StudentInterface() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void learn() {

            }
        };
        Human h = new Human() {
            @Override
            public void eat() {
                System.out.println("Eat...");
            }
        };
        h.eat();
        Human h2 = new Human() {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }
        };
        h2.eat();

        FptStudentInterface fs = ()->{
            System.out.println("Coding....");
        };
        fs.code();
    }
}
