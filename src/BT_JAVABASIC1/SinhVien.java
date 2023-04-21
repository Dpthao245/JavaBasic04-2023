package BT_JAVABASIC1;

public class SinhVien {
    public String HoTenSV;
    public SinhVien(String HoTenSV) {
        this.HoTenSV = HoTenSV;
    }
    public void showSinhVien() {
        System.out.println("Ho Ten Sinh Vien " + HoTenSV);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("DPThao");
        sv.showSinhVien();
    }


}