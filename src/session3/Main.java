package session3;

import assignment.Account;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Animal a =new Animal(1,"Dog");
        a.run();
        Dog d = new Dog(2,"cho",2022);
        d.run();
        d.eat();
        BullDog bd = new BullDog(3,"BullDog",2020);
        bd.run();
        bd.eat();
    }




    public static void main2(String[] args){
        int [] intarrays = new int[5];
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);//them phan tu (add)
        arrayList.add("hello");
        arrayList.add(new Account());
        arrayList.remove(0);//xoa phan tu (remove)

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("10");
        strArray.add("11");
        strArray.add("12");
        strArray.add("13");

        for (String s: strArray) {
            System.out.println(s);
        }
        for(int i =0;i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(10);

    }
}
