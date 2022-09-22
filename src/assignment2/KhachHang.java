package assignment2;

public class KhachHang {
    public int maKhachHang;
    public String hoTen;
    public int ngay;
    public int thang;
    public int nam;
    private String doiTuong;
    public int soLuong;
    public int donGia;
    private int dinhMuc;
    public int thanhTien;

    public KhachHang(int maKhachHang, String hoTen, int ngay, int thang, int nam, String doiTuong, int soLuong, int donGia, int dinhMuc) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int thanhTien() {

        int vuotDinhMuc = this.getSoLuong() - this.getDinhMuc();

        if (this.getSoLuong()>0 && this.getSoLuong() < this.getDinhMuc()) {
            this.thanhTien = this.getSoLuong() * this.getDonGia();

        } else if (this.getSoLuong()>0 && vuotDinhMuc < 50) {
            this.thanhTien = this.getDonGia() * this.getDinhMuc() + vuotDinhMuc * 1000;

        } else if (this.getSoLuong()>0 && vuotDinhMuc >=50 && vuotDinhMuc <= 100) {
            this.thanhTien = this.getDonGia() * this.getDinhMuc() + vuotDinhMuc * 1200;

        }else if (this.getSoLuong()>0 && vuotDinhMuc > 100 && vuotDinhMuc <= 200) {
            this.thanhTien = this.getDonGia() * this.getDinhMuc() + vuotDinhMuc * 1500;

        }else if (this.getSoLuong()>0 && vuotDinhMuc > 200) {
            this.thanhTien = this.getDonGia() * this.getDinhMuc() + vuotDinhMuc * 2000;
        }else {
            System.out.println("SL khong dung");
        }
        return getThanhTien();
    }

}
