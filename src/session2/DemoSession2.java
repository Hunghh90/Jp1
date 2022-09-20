package session2;

import session1.Car;

import java.util.Scanner;

public class DemoSession2 {
    public static void main(String[] args){
        Human h = new Human();
        h.run();
        h.run(5);
        h.run("cho duoi");
        h.run(10,"cho duoi");
        h.run(5,2);

        Human h2 = new Human("Hung");
        System.out.println(h2.name);

        Student s = new Student();
        s.setName("Hung");
        s.setTel("0328473280");
        s.setAddress("8 Ton That Thuyet");
        s.setAge(18);
        System.out.println(s.name);
        System.out.println(s.tel);
        System.out.println(s.address);
        System.out.println(s.age);

        Student s1 = new Student("Ha Hoang Hung","0916389812","Bac Kan",20,new Car());
        System.out.println(s1.name);
        System.out.println(s1.tel);
        System.out.println(s1.address);
        System.out.println(s1.age);

        int[] marks = new int[4];
        marks[0] = 19;

        Student[] students = new Student[10];
        students[0] = new Student();

        for(int i =0;i<students.length;i++){
            students[i] = new Student();
        }

        for(int i=0;i<students.length;i++){
            students[i].setAge(i+20);
        }

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].getAge());
        }

        for (Student st : students){
            System.out.println(st.getAge());
        }

    }
}
