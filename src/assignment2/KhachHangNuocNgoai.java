package assignment2;

public class KhachHangNuocNgoai extends KhachHangVietNam{
    private String quocTich;
    public int dinhMuc = 2000;


    public KhachHangNuocNgoai(int maKhachHang, String hoTen, int ngay, int thang, int nam, String doiTuong, int soLuong, int donGia, int dinhMuc, String quocTich) {
        super(maKhachHang, hoTen, ngay, thang, nam, doiTuong, soLuong, donGia, dinhMuc);
        this.quocTich = quocTich;
    }


    @Override
    public int getThanhTien() {
        return super.getThanhTien();
    }
}
