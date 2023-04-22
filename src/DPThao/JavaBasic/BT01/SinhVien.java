package DPThao.JavaBasic.BT01;

public class SinhVien {

    public static String HoTen = "Duong Phuong Thao";
    public static String MonHoc = "Selenium Java";
    public static int ThongTinTuoi = 28; //Khai báo biến static dùng cho class Thông Tin
    public static String ThongTinMSSV = "MSSV0001"; //Khai báo biến static dùng cho class Thông Tin
    public static String ThongTinBaiTap = "Bài Tập 01"; //Khai báo biến static dùng cho class Thông Tin
    public int Tuoi;
    public String MSSV;

    public void setTuoi (int Tuoi) {
        this.Tuoi = Tuoi;
    }
    public void setMSSV (String MSSV) {
        this.MSSV = MSSV;
    }

    public void ShowSV () {
        System.out.println("Tuổi: " + Tuoi);
        System.out.println("Mã số sinh viên: " + MSSV);
    }
    public void BaiTap () {
        String BaiTap = "Bài Tập 01";
        System.out.println("Bài Tập: " + BaiTap);
    }

    public static void main(String[] args) {
        System.out.println("Họ và tên sinh viên: " + HoTen);
        System.out.println("Môn Học: " + MonHoc);

        SinhVien bien = new SinhVien();
        bien.setMSSV("MS001");
        bien.setTuoi(28);
        bien.ShowSV();

        bien.BaiTap();
    }
}
