package session1;

public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 3;
        System.out.println("x="+x);
        String str = "Hello Word";
        if(x>5){
            System.out.println(str);
        }else{
            System.out.println("not found");
        }
        for(int i=0;i<10;i++){
            System.out.println("i = "+i);
        }
        Car c = new Car();
        Car c2 = new Car();
        c.brand = "Toyota";
        c.year = 2000;
        c.showInfo();
        c2.showInfo();
        System.out.println("c = " +c.brand);
        System.out.println("c = " +c2.year);
        Car.color = "red";
        System.out.println(Car.color);
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);
        TamGiac t = new TamGiac();
        t.setC1(4);
        t.setC3(5);
        t.setC2(6);
        System.out.println("chu vi = "+t.chuVi());
        System.out.println("dien tich = "+t.dienTich());

        BaiTap1 bt = new BaiTap1();
        bt.setMauSo(20);
        bt.setTuSo(4);
        bt.inPhanSo();
        bt.rutGon();

        BaiTap1 bt1 = new BaiTap1();
        bt1.setMauSo(8);
        bt1.setTuSo(4);
        bt1.inPhanSo();
        bt1.rutGon();



    }
}
