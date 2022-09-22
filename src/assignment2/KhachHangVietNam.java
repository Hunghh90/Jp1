package assignment2;

public class KhachHangVietNam extends KhachHang{

    public KhachHangVietNam(int maKhachHang, String hoTen, int ngay, int thang, int nam, String doiTuong, int soLuong, int donGia, int dinhMuc) {
        super(maKhachHang, hoTen, ngay, thang, nam, doiTuong, soLuong, donGia, dinhMuc);
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
