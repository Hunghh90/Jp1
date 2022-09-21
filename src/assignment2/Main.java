package assignment2;

public class Main {
    public static void main(String[] args){
        KhachHangVietNam kh1 = new KhachHangVietNam(1,"Hung",30,9,2022,"Kinh Doanh",149,500,50);

        System.out.println(kh1.thanhTien());

        KhachHangVietNam kh2 = new KhachHangVietNam(2,"Thai",30,9,2022,"Kinh Doanh",0,500,50);

        System.out.println(kh2.thanhTien());

        KhachHangVietNam kh3 = new KhachHangVietNam(3,"Hung",30,9,2022,"Kinh Doanh",500,500,150);

        System.out.println(kh3.thanhTien());

        KhachHangVietNam kh4 = new KhachHangVietNam(3,"Hung",30,9,2022,"Kinh Doanh",21,500,50);

        System.out.println(kh4.thanhTien());

        KhachHangNuocNgoai nn1 = new KhachHangNuocNgoai(3,"jonh",30,9,2022,"kinh doan",200,1000,2000,"American");
        System.out.println(nn1.thanhTien());
    }
}
