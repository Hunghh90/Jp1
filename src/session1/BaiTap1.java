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
        System.out.println(tuSo+"/"+mauSo);
    }
    public int timUSCLN(int getTuSo, int getMauSo) {
        if(! ktPhanSo()) System.out.println("Mau so phai khac 0");
        while (getTuSo != getMauSo) {
            if (getTuSo > getMauSo) {
                getTuSo -= getMauSo;
            } else {
                getMauSo -= getTuSo;
            }
        }
        return getTuSo;
    }
    public void rutGon(){
        int i = timUSCLN(this.getTuSo(),this.getMauSo());
        System.out.println(tuSo/i+"/"+mauSo/i);
    }
}
