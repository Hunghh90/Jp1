package assignment2;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;



    public KhachHangNuocNgoai(int maKhachHang, String hoTen, int ngay, int thang, int nam, String doiTuong, int soLuong, int donGia, int dinhMuc, String quocTich) {
        super(maKhachHang, hoTen, ngay, thang, nam, doiTuong, soLuong, donGia, dinhMuc);
        this.quocTich = quocTich;

    }


    @Override
    public int getThanhTien() {
        return super.getThanhTien();
    }
}
