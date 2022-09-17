package session1;

public class BaiTap1 {
    int tuSo;
    int mauSo;

    public BaiTap1(){
        tuSo=0;
        mauSo=1;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public boolean ktPhanSo(){
        return mauSo != 0;
    }

    public void inPhanSo(){
        if(! ktPhanSo()) System.out.println("Mau so phai khac 0");
        System.out.println(getTuSo()+"/"+getMauSo());
    }

    public void rutGon(){

        int ucln = 1;
        for(int i=Math.min(Math.abs(tuSo),Math.abs(mauSo));i>=1;i--){
            if(tuSo%i==0 && mauSo%i==0){
                ucln = i;
                break;
            }
        }
        setTuSo(tuSo/ucln);
        setMauSo(mauSo/ucln);
    }

    public void nghichDao(){
    int tmp = tuSo;
    tuSo = mauSo;
    mauSo = tmp;
    }

     public BaiTap1 add(BaiTap1 f){
        BaiTap1 tong = new BaiTap1();
        tong.setTuSo(this.getTuSo()*f.getMauSo() + this.getMauSo()* f.getTuSo()) ;
        tong.setMauSo(this.getMauSo()*f.getMauSo());
        tong.rutGon();
        return tong;
        }

     public BaiTap1 sub(BaiTap1 f){
         BaiTap1 hieu = new BaiTap1();
         hieu.tuSo = this.tuSo*f.mauSo - this.mauSo* f.tuSo;
         hieu.mauSo = this.mauSo*f.mauSo;
         hieu.rutGon();
         return hieu;
        }

     public void mul(){

        }

     public void div(){

        }
}
